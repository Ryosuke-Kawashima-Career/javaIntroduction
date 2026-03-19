public class Menu {
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
    Item[] items;

    Menu() {
        this.items = new Item[] {new Item("burger", 100), new Item("pizza", 200)};
    }

    public void print() {
        for (Item item : this.items) {
            item.print();

        }
    }
}