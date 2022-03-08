interface SomeFunc<T> {
    T func(T t);
}

class GenericFunctionalInterface {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result + str.charAt(i);
            }
            return result;
        };
        System.out.println("Reverse of java is " + reverse.func("java"));
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            while (n > 0) {
                result = result * n;
                n--;
            }
            return result;
        };
        System.out.println("Factorial of 5 is " + factorial.func(5));
    }
}
