// Animal class
class Animal {

    String name;

    // Constructor of Animal class
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

// Dog class
class Dog extends Animal {

    int age;

    // Constructor of Dog class
    Dog(String name, int age) {
        super(name); // calling parent constructor
        this.name=name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Main10 {
    public static void main(String[] args) {

        Dog d = new Dog("Buddy", 5);
        d.display();

    }
}
