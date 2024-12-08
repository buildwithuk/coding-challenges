public class App {

    public static int generate(int number) {

        if (number < 10)
            return number;
        else 
            return generateSum(0, number);
    }

    public static int generateSum(int previousSum, int number) {

        if (number < 10)
            return number + previousSum;
        
        else {

            int remainder = number % 10; // 12 -> 2
            int resultant = number / 10; // 12 => 1
            return generateSum(previousSum + remainder, resultant);

        }



    }

    

    public static void main(String[] args) throws Exception {
        System.out.println("The question is as belows");
        System.out.println("Write a recursive function to calculate the sum of the digits of a given number");
        
        int generatedSum = generate(453);

        System.out.println("Generated sum: " + generatedSum);
    }


}
