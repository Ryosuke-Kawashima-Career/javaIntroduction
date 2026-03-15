public class zeroDivision {
    public static void main(String[] args) {
        int result = zeroDivideInt(5, 0);
        System.out.println(result);
        double sqrt_five = Math.sqrt(5);
        int code_j = ((int) 'j');
        System.out.println(String.format("Output: %s, %s", sqrt_five, code_j));

    }

    private static int zeroDivideInt(int divient, int divisor) {
        try {
            return divient / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
            return 0;
        }
    }

}