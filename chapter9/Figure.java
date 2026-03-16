public abstract class Figure {
    // protected modifier for inheritance
    protected int x, y;
    Figure(int inputX, int inputY) {
        this.x = inputX;
        this.y = inputY;
    }

    protected void header(String name) {
        System.out.printf("%s(%d, %d)\n", name, this.x, this.y);
    }

    protected abstract void draw();
}