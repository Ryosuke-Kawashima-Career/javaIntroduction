public record RecordItem(String name, int price) {
    // Set properties like a function.
    public void print() {
        // Access the fields like a function.
        System.out.println(this.name() + " is " + this.price() + " yen!");
    }
}