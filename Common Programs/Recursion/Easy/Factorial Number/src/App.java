public class App {

    public static int findTheFactorial(int  number) {

        if (number == 1) 
            return 1; 
        
        else 
            return findTheFactorial(number-1) * number;

    }


    public static void main(String[] args) {
        
        int number = 10;
        System.out.println("The factorial of " + number + " is " + findTheFactorial(number));
    }
}
