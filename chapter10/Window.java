public class Window {
    public static void main(String[] args) {
        Button load = new Button(new LoadTask());
        Button save = new Button(new SaveTask());
        load.click();
        Button anonymous = new Button(new Task() {
            public void run() {
                System.out.println("This is an anomymous task button");
            }
        });
    }
}