public class Code implements Printable {
    private String code;

    Code(String inputString) {
        this.code = inputString;
    }

    @Override
    public void print() {
        System.out.println("Code: " + this.code);
    }

    @Override public String toString() {
        String result = String.format("Code: %s", this.code);
        return result;
    }
}
