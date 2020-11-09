/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number_1;

import java.util.ArrayList;

/**
 *
 * @author Cindy
 */
public class arrayMethods {
    
    public ArrayList<Object> returnArrayList(Object[] array){
        ArrayList<Object> arrayList = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
        
    }
    
}
