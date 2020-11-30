/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPkg;


import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cindy
 */
public class ServerThread extends Thread {

    private Server server = new Server();
    Socket socket = null;
    private BufferedReader reader = null;
    private PrintWriter printer = null;
    private static ArrayList<ServerThread> clients = new ArrayList<>();
    private DatabaseConnection connection = null;
    private boolean allow = false;
    private String room_id = "";

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public ServerThread(Socket socket, DatabaseConnection connection) {
        this.socket = socket;
        this.connection = connection;
        conn = (Connection) connection.getConnection();
        connection.getConnection();
        try {
            reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            printer = new PrintWriter(this.socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SaveToDatabase(String port, String name, String room_id, String msg) {
        try {
            String sql = "INSERT INTO `chatroom`(`user_port`, `name`, `room_id`, `msg`) VALUES (?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, port);
            pst.setString(2, name);
            pst.setString(3, room_id);
            pst.setString(4, msg);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        String name = "";
        String msg = "";
        String port = "";
        String msgOrUpdate = "";
        
        try {
            while (true) {
                this.clients = server.getClients();
                port = String.valueOf(socket.getPort());
                msgOrUpdate = reader.readLine();
                
                if (msgOrUpdate.equals("Send")) {
                    room_id = reader.readLine();
                    name = reader.readLine();
                    msg = reader.readLine();
                    
                    SaveToDatabase(port, name, room_id, msg);
                    DestributeMsg(room_id, name, port, msg);
                    
                    System.err.println("SEND");
                }else if(msgOrUpdate.equals("Update")){
                    room_id = reader.readLine();
                    allow = reader.ready();
                    UpdateRoom(room_id, allow);
                    
                    System.err.println("UPDATE");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
                printer.close();
                socket.close();
                TerminateCheck();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void DestributeMsg(String room_id, String name, String userport, String msgs) {
        for (int i = 0; i < clients.size(); i++) {
            if(room_id.equals(clients.get(i).room_id)){
                this.clients.get(i).printer.println(name + "(" + userport + ") : " + msgs);
            }
        }
    }

    public void TerminateCheck() {
        for (int i = 0; i < clients.size(); i++) {
            if (this.clients.get(i).socket.isClosed() == true) {
                this.clients.remove(i);
                server.setClients(clients);
            }
        }
    }
    
    public void UpdateRoom(String room_id, boolean allows) {
        String SendSMS = "";
        try {
            String sql = "SELECT `msg_id`, `user_port`, `name`, `room_id`, `msg` FROM `chatroom`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                if(Integer.parseInt(room_id) == rs.getInt("room_id")){
                    printer.println(rs.getString("name") + "(" + rs.getString("user_port") + ") : " + rs.getString("msg"));
                }
            }
            allow = false;
        } catch (SQLException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
