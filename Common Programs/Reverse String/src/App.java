import java.util.Arrays;

public class App {


    public static String reverseString(String str) {

        var stringChars = str.toCharArray();

        String s = "";

        return doReverse(str.length()-1, stringChars, s); 

    }

    public static String doReverse(int index, char[] remainingCharacters, String s) {

        StringBuilder sb = new StringBuilder(s);

        sb.append(remainingCharacters[index]);

        s = sb.toString();

        if (index == 0) 
            return s;
        else  {
            index--;
            return doReverse(index, remainingCharacters, s);
        }
            

    }

    public static void main(String[] args) {
        System.out.println("Reversed String");
        System.out.println(reverseString("str"));
    }
}
