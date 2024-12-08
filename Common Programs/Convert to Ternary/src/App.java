public class App {

    public static String convertToTernary(String sampleNumber) {


        int sampleNumberInInteger = Integer.parseInt(sampleNumber);

        StringBuilder sb = new StringBuilder();

        while (sampleNumberInInteger > 1) {


            int remainder = sampleNumberInInteger % 3;

            sampleNumberInInteger = sampleNumberInInteger / 3;

            sb.append(remainder);

        }

        return sb.reverse().toString();

    }


    public static void main(String[] args) throws Exception {
        System.out.println(convertToTernary("6"));
    }
}
