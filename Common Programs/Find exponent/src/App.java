public class App {


    public static Integer findExponent(int n, int power, int exponential) {

        if (power == 0) {
            return exponential * n;
        } else {
                       
            exponential = n * n;
            power--;
            return findExponent(n, power, exponential);
        }

        
    }
    public static void main(String[] args) {
     
        int number = 4; 
        int power = 3;
        int exponential = findExponent(number, power, number);
        System.out.println("Finally the exponent " + exponential);
    }
}
