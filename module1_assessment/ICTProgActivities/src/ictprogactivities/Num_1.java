
package ictprogactivities;


public class Num_1 {
    
    public static void main(String[] args) {
        
        int[] array1 = new int[3];
        int[] array2 = new int[10];
        
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        
        array2[0] = 5;
        array2[1] = 5;
        array2[2] = 5;
        
        arraycopy(array1, 1, array2, 3, 2);
        
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Array "+i+" : " + array2[i]);
        }
        
    }
    
    public static void arraycopy(int[] from,int fromstart, int[] to, int tostart, int count) {  
       
        for (int i = 0; i < count; i++) {
            to[tostart + i] = from[fromstart + i];
        }
        
    }
    
}
