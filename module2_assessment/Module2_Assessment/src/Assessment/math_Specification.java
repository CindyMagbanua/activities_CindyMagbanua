
package Assessment;


public class math_Specification {
    
    public static void main(String[] args) {
        int[] randomVar = new int[10];
        
        int gen = 0;
        
        for (int i = 0; i < randomVar.length; i++) {
            gen = (int) (Math.random() * 101);
            randomVar[i] = gen;
            System.out.println(randomVar[i]);
        }
        
    }
    
}
