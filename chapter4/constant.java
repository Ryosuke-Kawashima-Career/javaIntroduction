public class constant {
    public static void main(String[] args) {
        final double AVOGADRO = 6.02e23;
        final double PLANK = 6.63e-34;
        double avogadro = AVOGADRO;
        System.out.println("avogadro = " + avogadro);
        processString("Good morning");
    }

    private static void processString(String s) {
        int numberOfLetters = s.length();
        String upperText = s.toUpperCase();
        String lowerText = s.toLowerCase();
        String replaced = s.replace("morning", "night");
        System.out.println(
                "Number of letters: " + numberOfLetters + "\n" +
                        "Upper: " + upperText + "\n" +
            "lower: " + lowerText + "\n" +
            "replaced: " + replaced + "\n"
        );
    }
}