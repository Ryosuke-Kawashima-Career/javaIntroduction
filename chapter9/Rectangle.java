public class Rectangle extends Figure {
//    int x, y; are comming from Figure
    int width, height;

    Rectangle(int inputX, int inputY, int inputWidth, int inputHeight) {
        super(inputX, inputY);
        this.width = inputWidth;
        this.height = inputHeight;
    }

    @Override
    public void draw() {
        super.header("rectangle");
        System.out.printf("rectangle(%d, %d) size: %d x %d\n", this.x, this.y, this.width, this.height);
    }
}