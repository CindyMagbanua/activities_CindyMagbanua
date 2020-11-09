
package ictprogactivities;


public class Num_2 {
    
    public static void main(String[] args) {
        
        String[][] stringArray = new String[10][10];
        //for input
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                stringArray[i][j] = "@ ";
            }
        }
        //for output
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                System.out.print(stringArray[i][j]);
            }
            System.out.print("\n");
        }
    }
}
