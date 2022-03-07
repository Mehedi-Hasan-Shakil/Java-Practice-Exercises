import java.lang.String;

interface StringReverse {
    String reverse(String str);
}

public class ReverseString {
    public static void main(String[] args) {
        StringReverse reversedString = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result + str.charAt(i);
            }
            return result;
        };
        System.out.println("Reverse of Java is " +
                reversedString.reverse("Java"));
    }
}
