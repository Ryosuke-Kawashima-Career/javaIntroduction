public class Dog {
    private String name;
    private int age;

    static int COUNT = 0;

    // Constructor
    Dog(String inputName, int inputAge) {
        this.name = inputName;
        this.age = inputAge;
        COUNT++;
    }

    public String profile() {
        String info = String.format("%s(%d years old)", this.name, this.age);
        return info;
    }

    public void eat(String food) {
        System.out.println(this.profile() + " is eating " + food);
    }

    // Override within the same class
    public void eat() {
        System.out.println("" + this.profile() + " is drinking water");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int inputAge) {
        this.age = inputAge;
    }

    public static void report() {
        System.out.printf("%s dogs have been created\n", COUNT);
    }

    // Static block
    static {
        System.out.println("Dog class is loaded!");
    }

    // Instance block
    {
        System.out.println("An instance of Dog has been created!");
    }

//  - Dog class is loaded! — from a static initializer (static { ... }), runs once when the class is first loaded
//  - An instance of Dog has been created! — from an instance initializer ({ ... }), runs every time a new object is created
}