/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPkg;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cindy
 */
public class Server {

    private static int PORT = 2324;
    private static ExecutorService executor = Executors.newFixedThreadPool(100);
    private static ArrayList<ServerThread> clients = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        ServerSocket server = new ServerSocket(PORT);
        System.out.println("SERVER IS READY ACCEPTING CLIENT!");
        DatabaseConnection connection = new DatabaseConnection();
        while (true) {
            try {
                socket = server.accept();
                System.out.println("ACCEPTED CLIENT " + socket.getPort());
                ServerThread thread = new ServerThread(socket, connection);
                addNewClients(thread);
                executor.execute(thread);
               
               for (int i = 0; i < clients.size(); i++) {
                    System.out.println(clients.get(i).socket.getPort());
                }
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    public static void addNewClients(ServerThread st){
        clients.add(st);
    }
    
    public ArrayList<ServerThread> getClients(){
        return clients;
    }
    
    public static void setClients(ArrayList<ServerThread> client){
        clients = client;
    }

}
