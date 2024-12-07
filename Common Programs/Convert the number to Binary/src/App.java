public class App {

    public static String convertToBinary(String sampleNumber) {

        int sampleNumberToInt = Integer.parseInt(sampleNumber);

        StringBuilder sb = new StringBuilder();

        while (sampleNumberToInt >= 1) {

            var remainder = sampleNumberToInt % 2;

            sb.append(remainder);

            sampleNumberToInt = sampleNumberToInt / 2;
        
        }




        return sb.reverse().toString();




    }



    public static void main(String[] args) throws Exception {
        System.out.println(convertToBinary("4"));
    }
}
