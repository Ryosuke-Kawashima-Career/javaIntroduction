public class flow {
    public static void main(String[] args) {
        labelProblem();
    }
    private static void labelProblem() {
        outer:
        for (int n=0; n<100; n++) {
            for (int i=2; i<n; i++) {
                if (n % i == 0) {
                    continue outer;
                }
            }
            System.out.println(n);
        }
    }
}