interface I1 {
    int roll = 590;        // public static final by default
    String name = "Keshu";
}
interface I2 extends I1 {
    void display();       // abstract method
}
class Student implements I2 {

    public void display() {
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
    }
}
public class interface_extends {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        System.out.println(Student.name);
    }
}
