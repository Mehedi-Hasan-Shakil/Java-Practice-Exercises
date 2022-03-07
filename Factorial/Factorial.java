interface FactorialCalculator {
    int getFactorial(int number);
}

class Factorial {
    public static void main(String[] args) {
        FactorialCalculator factorial = (number) -> {
            int result = 1;
            while (number > 0) {
                result = result * number;
                number--;
            }
            return result;
        };
        System.out.println("Factorial of 5 is " + factorial.getFactorial(5));
    }
}
