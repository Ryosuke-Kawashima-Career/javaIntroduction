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
        class localItem {
            private String name;
            private int price;
            localItem(String inputName, int inputPrice) {
                this.name = inputName;
                this.price = inputPrice;
            }
            public void print() {
                System.out.println(this.name + " is a " + this.price + "yen item!");
            }
        }
        for (Item item : this.items) {
            localItem local = new localItem(item.name, item.price);
            local.print();

        }
    }
}