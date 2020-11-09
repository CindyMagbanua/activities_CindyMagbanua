
package ictprogactivities;


public class Num_4 {
    
    public static void main(String[] args) {
        
        String given = "Cindy Magbanua";
        String contain = "ua";
        String getLast = given.substring(given.length() - 2, given.length());
        
        System.out.println("The given string is : "+given);
        System.out.println("The string containing "+contain+" at last : " + (getLast.equals(contain))); 
        
    }
    
}
