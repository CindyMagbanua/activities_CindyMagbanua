
package ictprogactivities;


public class Num_5 {
    
    public static void main(String[] args) {
        
        String given = "Cindy Mai Cgbai Cni Cua";
        String mask = "cinCdy";
        String output = null;
        StringBuffer buff = new StringBuffer(given);
        
        for (int i = 0; i < buff.length(); i++) {
            for (int j = 0; j < mask.length(); j++) {
                if (buff.charAt(i) == mask.charAt(j)) {
                    buff.deleteCharAt(i);
                    i--;
                   break;
                }
            }
        }
        output = buff.toString();
        
        System.out.println("The given string is : " + given);
        System.out.println("The given mask string is : " + mask);
        System.out.println("The new string is : " + output);
        
    }
    
}
