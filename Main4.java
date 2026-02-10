class Student {
   int r = 10;
   static String name = "John";
   void display() {
    System.out.println("Roll number: " + r);
    System.out.println("Name: " + name);
   }
   static void show() {
    System.out.println("Name: " + name);
   }

}
public class Main4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student.show();
    }
}
