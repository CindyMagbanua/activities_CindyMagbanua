
package ictprogactivities;

import java.io.File;



public class Num_7 {
    
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Cindy\\Desktop\\";
        
        File file = new File(fileName);

        String[] files = file.list();

        for(int i = 0; i < files.length; i++){
            System.out.println(files[i]);
        }
    
    }
}
