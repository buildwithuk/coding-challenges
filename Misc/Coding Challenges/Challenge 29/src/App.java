import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<List<Integer>> generate(int numRows) {

        int level = 1;

        List<List<Integer>> pascalsTriangles = new ArrayList<>();

        pascalsTriangles = generateLevels(pascalsTriangles, numRows, level);

        return pascalsTriangles;
    }

    private static List<List<Integer>> generateLevels(List<List<Integer>> pascalsTriangles, int numRows, int level) {

        if (level == 1) {

            List<Integer> pascalLevel = new ArrayList<>();

            pascalLevel.add(1);
            pascalsTriangles.add(pascalLevel);

            return generateLevels(pascalsTriangles, numRows, level + 1);

        } else if (level > numRows) {

            return pascalsTriangles;

        } else {

            List<Integer> levelLine = generateLevelLine(pascalsTriangles.get(pascalsTriangles.size() - 1), level);

            pascalsTriangles.add(levelLine);

            return generateLevels(pascalsTriangles, numRows, level + 1);
        }

    }

    private static List<Integer> generateLevelLine(List<Integer> list, int level) {

        List<Integer> lineToReturn = new ArrayList<>();
        lineToReturn.add(1);

        for (int a = 0; a < list.size(); a++) {

            if ((a + 1) >= list.size())
                break;
            else {
                lineToReturn.add(list.get(a) + list.get(a + 1));
            }

        }

        lineToReturn.add(1);

        return lineToReturn;

    }

    public static void main(String[] args) throws Exception {

        var pascalsTriangles = generate(4);

        for (List<Integer> list : pascalsTriangles) {

            StringBuilder sb = new StringBuilder();
            for (Integer i : list) {
                sb.append(i);
                sb.append('\t');
            }
            System.out.println(sb.toString());
        }

    }
}
