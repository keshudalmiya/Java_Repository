class Student{
    int r;
    String name;
    Student(int r, String name){
        this.r = r;
        this.name = name;
    }
    void display(){
        System.out.println(r + " " + name);
    }
    void show( Student s){
       this.r = s.r;
       this.name = s.name;
    }
}
public class copy_costructor {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        Student s2 = new Student(1, "Keshu");
        // Student s2 = new Student(s1.r, s1.name); // Copy constructor
        s2.show(s1); // Using show method to copy values
        s1.display();
        // s2.display();
    }
}
