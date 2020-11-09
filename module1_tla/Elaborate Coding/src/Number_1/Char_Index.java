
package Number_1;


public class Char_Index {
    
    public static void main(String[] args) {
        StringMethods smethods = new StringMethods();
        String myString = "Cindy";
        
        System.out.println(smethods.returncharAt(myString, 1));//for CharAt
        System.out.println(smethods.returnIndexOf(myString, "ndy"));//for IndexOf
    }
    
}
