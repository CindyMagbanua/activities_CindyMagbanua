/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3_assessment;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cindy
 */
public class Frame extends javax.swing.JFrame {

    private Thread thread;
    private Runs running = running = new Runs();
    private Random rand = new Random();
    private int MaxColorHue = 241; //random starts from zero... 0-240 is used in random
    
    public Frame() {
        initComponents();
        
    }
    
    public void XmasAnimation(){
        A.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        B.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        C.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        D.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        E.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        F.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        G.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        H.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        J.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        K.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        L.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        M.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        N.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        O.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        P.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        Q.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
        Z.setBackground(new Color(rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue), rand.nextInt(MaxColorHue)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        A = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        Z = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        K = new javax.swing.JLabel();
        Q = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        A.setBackground(new java.awt.Color(153, 153, 255));
        A.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.setText("A");
        A.setOpaque(true);

        C.setBackground(new java.awt.Color(153, 153, 255));
        C.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.setText("C");
        C.setOpaque(true);

        G.setBackground(new java.awt.Color(153, 153, 255));
        G.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G.setText("G");
        G.setOpaque(true);

        N.setBackground(new java.awt.Color(153, 153, 255));
        N.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N.setText("N");
        N.setOpaque(true);

        Z.setBackground(new java.awt.Color(153, 153, 255));
        Z.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Z.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Z.setText("Z");
        Z.setOpaque(true);

        D.setBackground(new java.awt.Color(153, 153, 255));
        D.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.setText("D");
        D.setOpaque(true);

        B.setBackground(new java.awt.Color(153, 153, 255));
        B.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("B");
        B.setOpaque(true);

        H.setBackground(new java.awt.Color(153, 153, 255));
        H.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("h");
        H.setOpaque(true);

        F.setBackground(new java.awt.Color(153, 153, 255));
        F.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        F.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F.setText("F");
        F.setOpaque(true);

        J.setBackground(new java.awt.Color(153, 153, 255));
        J.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J.setText("J");
        J.setOpaque(true);

        E.setBackground(new java.awt.Color(153, 153, 255));
        E.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E.setText("E");
        E.setOpaque(true);

        O.setBackground(new java.awt.Color(153, 153, 255));
        O.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O.setText("O");
        O.setOpaque(true);

        M.setBackground(new java.awt.Color(153, 153, 255));
        M.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        M.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M.setText("M");
        M.setOpaque(true);

        P.setBackground(new java.awt.Color(153, 153, 255));
        P.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P.setText("P");
        P.setOpaque(true);

        K.setBackground(new java.awt.Color(153, 153, 255));
        K.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        K.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        K.setText("K");
        K.setOpaque(true);

        Q.setBackground(new java.awt.Color(153, 153, 255));
        Q.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Q.setText("Q");
        Q.setOpaque(true);

        L.setBackground(new java.awt.Color(153, 153, 255));
        L.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L.setText("L");
        L.setOpaque(true);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("STOP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(O, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        thread = new Thread(running);
        thread.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            if(thread.isAlive()){
                thread.stop();
            }else{
                System.out.println("Thread alwready stopped!");
            }
        } catch (Exception ex) {
            System.out.println("Thread Not started yet!");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JLabel H;
    private javax.swing.JLabel J;
    private javax.swing.JLabel K;
    private javax.swing.JLabel L;
    private javax.swing.JLabel M;
    private javax.swing.JLabel N;
    private javax.swing.JLabel O;
    private javax.swing.JLabel P;
    private javax.swing.JLabel Q;
    private javax.swing.JLabel Z;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    class Runs implements Runnable{
        
        @Override
        public void run() {
            try {
                while (true) {                    
                    Thread.sleep(400);
                    XmasAnimation();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
}
