public class Item {
    private String name;
    private int price;

    Item(String inputName, int inputPrice) {
        this.name = inputName;
        this.price = inputPrice;

    }

    public void print() {
        System.out.println(this.name + " " + this.price + "yen!");
    }
}