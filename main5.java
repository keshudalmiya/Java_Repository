class Staticexample {
  void normal() {
    System.out.println("This is a normal method");
  }
  static void display() {
    System.out.println("This is a static method");
  }
  static void show() {
    System.out.println("This is another static method");
  }
}
public class main5 {
  public static void main(String[] args) {
    Staticexample obj = new Staticexample();
    obj.normal(); // Calling normal method using object
    Staticexample.display(); // Calling static method using class name
    Staticexample.show(); // Calling another static method using class name
  }
}
