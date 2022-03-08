import java.beans.PropertyEditorSupport;
import java.util.Locale;

interface StringFunc {
    String func(String n);
}

class LambdaAsArguments {
    static String stringOperation(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        System.out.println("Before String Operation : " + inStr);
        String outStr = stringOperation((str) -> str.toUpperCase(), inStr);
        System.out.println("After String Operation : " + outStr);

        //Remove spaces
        String spaceFreeString = stringOperation((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result = result + str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println("After removing all spaces : " + spaceFreeString);

    }
}
