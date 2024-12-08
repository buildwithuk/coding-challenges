public class App {


    public static int findTheOccuranceOfAString(String str, char c) {

        int occurances = 0;
        int index = 0;

        return recursiveFunction(index, occurances, str, c);

    }

    public static int recursiveFunction(int index, int occurances, String str, char c) {

        if (index >= str.length())
            return occurances;
        
        char characterAtIndex = str.charAt(index);

        if (characterAtIndex == c) 
            occurances++;

        return recursiveFunction(index + 1, occurances, str, c);

    }

    public static void main(String[] args)  {
        System.out.println(findTheOccuranceOfAString("addbvvbdrereed", 'v'));


    }
}
