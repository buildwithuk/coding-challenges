import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {


    public static int cookies(int k, List<Integer> A) {
        // Write your code here
    
    
            boolean sweetnessPending = true;
            int iterations = 0;
            
            // Sort the list
            // Pick the two items and apply the formula
            // replace them in the array 
            // check if all the items have sweentess greter than 9
            
            
            while(sweetnessPending) {
                
                // Sorting the list
                Collections.sort(A);
                
                int leastSweented = A.get(0);
                int aBitMoreSweetneed = A.get(1);
                
                // Removing both of these
                
                int newlySweetneed = 1*(leastSweented) + 2 * aBitMoreSweetneed;
                
                System.out.println(leastSweented);
                System.out.println(aBitMoreSweetneed);
                System.out.println(newlySweetneed);
                
                A.remove(0); 
                A.remove(0);
                
                A.add(newlySweetneed);
                
                Collections.sort(A);
                
                iterations++;
                sweetnessPending = A.get(0) < k;
                
                
            }
    
            return iterations;
        }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Integer> list = new ArrayList<>();
        list.add(1 );
        list.add(2);
        list.add(3); 
        list.add(9);
        list.add(10); 
        list.add(12);
        System.out.println(cookies(7, list));
    }
}
