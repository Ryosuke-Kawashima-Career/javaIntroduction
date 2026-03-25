public class Shop {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.print();
//        Menu.Item item = new Menu.Item("hotcake", 200); if static
        Menu.Item item = menu.new Item("coldcake", 300);
        item.print();

        RecordItem recordItemA = new RecordItem("hotcake", 100);
        RecordItem recordItemB = new RecordItem("hotcake", 100);
        System.out.println(recordItemA.equals(recordItemB) ? "same" : "different");

    }
}
