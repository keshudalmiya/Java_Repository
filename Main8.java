class student {
  int r;
    String name;

    public void display() {
        System.out.println("Roll number: " + r);
        System.out.println("Name: " + this.name);
    }

}
public class Main8 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.r = 101;
        s1.name = "Alice";
        s1.display();

        student s2 = new student();
        s2.r = 102;
        s2.name = "Bob";
        s2.display();
    }
}
