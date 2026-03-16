public class Editor {
    public static void main(String[] args) {
        Label label = new Label(10, 20, "Hello");
        label.print();
        Code code = new Code("Good Bye Code");
        code.print();
        Printable[] printables = new Printable[] {label, code};
        for (Printable p : printables) {
            p.print();
        }
        Object[] objects = new Object[] {label, code};
        for (Object o : objects) {
            switch (o) {
                case Figure f -> f.draw();
                default -> ((Printable) o).print();
            }
        }
    }
}