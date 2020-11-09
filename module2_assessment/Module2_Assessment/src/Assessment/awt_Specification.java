/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment;

 import java.awt.*; 

public class awt_Specification extends Frame{

        awt_Specification() {
            Button b = new Button("click me");
            b.setBounds(30, 100, 80, 30);
            add(b);
            setSize(300, 300);
            setLayout(null);
            setVisible(true);
        }

        public static void main(String args[]) {
            awt_Specification f = new awt_Specification();
        }
    
}
