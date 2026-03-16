public class FlowerCircle extends Circle {

    FlowerCircle(int inputX, int inputY, int inputRadius) {
        super(inputX, inputY, inputRadius);
    }

    @Override
    public void draw() {
        System.out.println("Flower ");
        super.draw();
    }
}