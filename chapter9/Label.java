public class Label extends Figure implements Printable {
    private String text;

    Label(int inputX, int inputY, String inputText) {
        super(inputX, inputY);
        this.text = inputText;
    }

    @Override
    public void draw() {
        System.out.printf("label(%d, %d) text: %s\n", this.x, this.y, this.text);
    }

    @Override
    public void print() {
        System.out.println(this.text);
    }

    @Override
    public String toString() {
        String result = String.format("Label: %s", this.text);
        return result;
    }
}