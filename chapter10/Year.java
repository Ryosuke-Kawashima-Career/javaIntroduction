public class Year {
    public static void main(String[] args) {
        System.out.println(Month.JAN);
        Month m = Month.FEB;
        System.out.println(m);
        // print all the months
        for (Month month : Month.values()) {
            System.out.print(" " + month);
        }
        System.out.println();

    }
}