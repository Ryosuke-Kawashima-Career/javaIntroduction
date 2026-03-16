public class Circle extends Figure {
//    int x, y; are comming from Figure
    int radius;

    Circle(int inputX, int inputY, int inputRadius) {
        super(inputX, inputY);
        this.radius = inputRadius;
    }

    @Override
    public void draw() {
        super.header("circle");
        System.out.printf("circle(%d, %d) radius: %d\n", this.x, this.y, this.radius);
    }
}