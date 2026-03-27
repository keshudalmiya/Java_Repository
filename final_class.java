// class Student {

//     String name;
//     static String college = "ABC College";

//     Student(String name) {
//         this.name = name;
//     }

//     void display() {
//         System.out.println(name + " - " + college);
//     }
// }

// public class final_class {
//     public static void main(String[] args) {

//         Student s1 = new Student("Rahul");
//         Student s2 = new Student("Aman");

//         s1.display();
//         s2.display();
//     }
// }



abstract class Animal {

    abstract void sound(); // abstract method

    void sleep() { // normal method
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class final_class {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
