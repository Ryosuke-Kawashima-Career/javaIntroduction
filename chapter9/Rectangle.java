public class Rectangle {
    int x, y;
    int width, height;

    Rectangle(int inputX, int inputY, int inputWidth, int inputHeight) {
        this.x = inputX;
        this.y = inputY;
        this.width = inputWidth;
        this.height = inputHeight;
    }

    public void draw() {
        System.out.printf("rectangle(%d, %d) size: %d x %d\n", this.x, this.y, this.width, this.height);
    }
}