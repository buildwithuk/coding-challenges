import java.util.ArrayList;
import java.util.List;

public class App {

    public static Integer[] findThePrimeNumbers(int n) {

        List<Integer> primeNumbers = new ArrayList();


        if (n > 2)
        primeNumbers.add(2);


        for (int a = 1; a <= n; a++) {

            for (int b = 2; b < a; b++) {


                if (a % b == 0)
                    break;

                if ( a == 2 || b == a-1) {
                    primeNumbers.add(a);
                    break;
                }
            }

        }

        return primeNumbers.toArray(new Integer[1]);

    }


    public static void main(String[] args) throws Exception {


        var pNumbers = findThePrimeNumbers(20);

        for (Integer integer : pNumbers) {
            System.out.println(integer);
        }
    }
}
