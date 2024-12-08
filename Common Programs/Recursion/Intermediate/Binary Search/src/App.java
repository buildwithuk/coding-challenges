import java.util.Arrays;

public class App {

    public static int performBinarySearch(int[] array, int n) {

        // Binary search needs the array to be sorted
        Arrays.sort(array);

        if (array.length == 1) {
            return array[0] == n ? 1 : -1;
        }

        // Find the middle of the array
        int middleIndexOfTheArray = array.length / 2;

        // Split the array into half

        int[] firstHalfOfTheArray = Arrays.copyOfRange(array, 0, middleIndexOfTheArray);

        int lengthOfTheFirstHalfOfArray = firstHalfOfTheArray.length;


        if (n <= firstHalfOfTheArray[lengthOfTheFirstHalfOfArray - 1]) {
            return performBinarySearch(firstHalfOfTheArray, n);
        } else {

            int[] secondHalfOfTheArray = Arrays.copyOfRange(array, middleIndexOfTheArray, array.length);
            return performBinarySearch(secondHalfOfTheArray, n);
        }

    }


    public static void main(String[] args) {

        int[] array = new int[] { 1, -2, 5, 4, -10, 0};

        int index = performBinarySearch(array, 5);

        System.out.println(index);

    }
}
