import java.util.ArrayList;
import java.util.List;

public class App {

    public static Integer[] getMultiplesOfANumber(int n) {

        if ( n == 1) {
            return new Integer[]{1};
        }

        List<Integer> multiplesOfANumer = new ArrayList<>();

        multiplesOfANumer.add(1); // Since 1 is the multiple of every number

        while (n != 1) {

            for (int a = 2; a <= n; a++) {

                if (n % a == 0) {
                    multiplesOfANumer.add(a);
                    n = n / a;
                    break;
                }
            }
        }

        return multiplesOfANumer.toArray(new Integer[1]);


    }



    public static void main(String[] args) {
        
        System.out.println("Find the multiples of the number");

        var multiples = getMultiplesOfANumber(18);

        for (Integer integer : multiples) {
            System.out.println(integer);
        }




    }
}
