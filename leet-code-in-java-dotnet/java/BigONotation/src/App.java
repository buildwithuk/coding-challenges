public class App {


    public static void printItems(int n) {

        for (int a = 0; a < n; a++) {
            System.out.println("Value of a " + a);
        }

    }

    public static void printItemsOfPair(int n) {


  for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                System.out.println("Pair of the numbers: (" + a+ " , " + b +")");
            }
        }

    }

    public static void main(String[] args) throws Exception {
        

        printItems(10);
        printItemsOfPair(3);

    }
}
