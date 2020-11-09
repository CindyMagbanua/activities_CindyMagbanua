
package ictprogactivities;


public class Num_3 {
    
    public static void main(String[] args) {
        
        int[] example = {87,98,75,90,89};//example array
        int sum = 0;
        int ave = 0;
        
        for (int i = 0; i < example.length; i++) {
            sum += example[i];
        }
        
        ave = sum/example.length;
        
        System.out.println("The average is : "+ave);
        
    }
    
}
