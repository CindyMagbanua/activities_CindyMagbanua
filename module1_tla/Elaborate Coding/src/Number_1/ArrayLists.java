
package Number_1;

import java.util.ArrayList;


public class ArrayLists {
    
    public static void main(String[] args) {
        arrayMethods amethods = new arrayMethods();
        String[] names = new String[5];
        names[0] = "Cindy";
        names[1] = "Newbie";
        names[2] = "Wow";
        names[3] = "HAHAHA";
        names[4] = "NO IDEA";
        
        ArrayList<Object> arrayList = new ArrayList<>();
        
        arrayList.addAll(amethods.returnArrayList(names));
        
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    
}
