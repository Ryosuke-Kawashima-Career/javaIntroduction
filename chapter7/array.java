import java.util.Arrays;

public class array {
    public static void main(String[] args) {
//        arrayOperations();
//        referenceVsClone();
//        commandLineArgs(args);
        multiDimensionalArray();
    }
    private static void arrayOperations() {
        int[] prices = new int[7];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = i + 110;
        }
        for (int price: prices) {
            System.out.print("price = " + price + "\n");
        }

        for (int i=prices.length-1; i>=0; i--) {
            System.out.print("Reversed price = " + prices[i] + "\n");
        }
    }
    private static void referenceVsClone() {
        String[] colors = new String[] {"red", "blue", "Yellow"};
        String[] colors1 = colors;
        String[] colors2 = colors.clone();
        colors[0] = "Green";
        System.out.println("Colors1: " + Arrays.toString(colors1));
        System.out.println("Colors2: " + Arrays.toString(colors2));
    }
    private static void commandLineArgs(String args[]) {
        for (int i=0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
    private static void multiDimensionalArray() {
        int[][] matrix = new int[9][];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = new int[row + 1];
        }
        for (int row=0; row < matrix.length; row++) {
            for (int col=0; col < row + 1; col++) {
                matrix[row][col] = (row + 1) * (col + 1);
            }
        }
        for (int row=0; row < matrix.length; row++) {
            for (int col=0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}