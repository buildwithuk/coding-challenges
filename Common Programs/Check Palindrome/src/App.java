public class App {


    
    public static boolean checkPalindromeString(String str) {

        var stringChars = str.toCharArray();

        String s = "";

        String reversedString = doReverse(str.length()-1, stringChars, s); 

        return str.equals(reversedString);

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
        System.out.println(checkPalindromeString("madam") ? "String is Palindrome" : "Not a palindrome");
    }
}
