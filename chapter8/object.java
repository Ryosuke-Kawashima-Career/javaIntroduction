public class object {
    public static void main(String[] args) {
        Dog black = new Dog("kuro", 2);

        Dog white = new Dog("shiro", 3);
        white.setAge(4);

        System.out.println(white.profile());
        Dog.report();
    }
}