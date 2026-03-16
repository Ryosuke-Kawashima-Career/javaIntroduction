public class Circle {
    int x, y;
    int radius;

    Circle(int inputX, int inputY, int inputRadius) {
        this.x = inputX;
        this.y = inputY;
        this.radius = inputRadius;
    }

    public void draw() {
        System.out.printf("circle(%d, %d) radius: %d\n", this.x, this.y, this.radius);
    }
}