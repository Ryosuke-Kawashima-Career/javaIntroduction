public class Shop {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.print();
//        Menu.Item item = new Menu.Item("hotcake", 200); if static
        Menu.Item item = menu.new Item("coldcake", 300);
        item.print();
    }
}