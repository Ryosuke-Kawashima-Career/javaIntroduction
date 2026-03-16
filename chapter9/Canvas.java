public class Canvas {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20, 30, 40);
        FlowerCircle fc = new FlowerCircle(10, 20, 30);
        Label label = new Label(10, 20, "Hello");
        label.draw();
    }
}