import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<Integer> generateTheFabbionciNumbers(int n) {

        List<Integer> fabbionciNumbers = new ArrayList<>();

        if (n == 1) {

            fabbionciNumbers.add(1);
            return fabbionciNumbers;
        }

        fabbionciNumbers.add(1);

        return generateAnotherFabbionci(n, 1, 1, 1, fabbionciNumbers);

    }

    public static List<Integer> generateAnotherFabbionci(int maxIndex, int index, int peviousSum, int nextNum,
            List<Integer> generatedSequence) {

        if (index == maxIndex) {
            return generatedSequence;
        } else {

            int sum = peviousSum + nextNum;
            generatedSequence.add(sum);

            return generateAnotherFabbionci(maxIndex, index + 1, nextNum, sum, generatedSequence);
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println("The question looks like: ");
        System.out.println("Generate the first n digits of the Fabbionic Series");

        List<Integer> fabbionciNumbers = generateTheFabbionciNumbers(10);

        for (Integer integer : fabbionciNumbers) {
            System.out.println(integer);
        }

    }
}
