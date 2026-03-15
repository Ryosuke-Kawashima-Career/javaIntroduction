public class condition {
    public static void main(String[] args) {
        problem2();
        switchProblems();
    }
    private static void problem2() {
        String a = "apple";
        String b = "banana";
        int compAa = a.compareTo(a);
        int compAb = a.compareTo(b);
        int compBa = b.compareTo(a);
        int compBb = b.compareTo(b);
        System.out.println("Results: " + compAa + " " + compAb + " " + compBa + " " + compBb);
    }
    private static void switchProblems() {
        int drink = 1;
        switch (drink) {
            case 1:
                System.out.println("Coffee");
                break;
            case 2:
                System.out.println("Tea");
                break;
            default:
                System.out.println("Water");
                break;
        }
        int drink2 = 2;
        switch (drink2) {
            case 1 -> System.out.println("Coffee");
            case 2 -> System.out.println("Tea");
            default -> System.out.println("Water");
        }

    }
}