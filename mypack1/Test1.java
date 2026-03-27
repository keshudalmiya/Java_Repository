package mypack1;

class Sample {
    static int a = 10;
    static String name ="Keshu";
      static void display(){
        System.out.println("Display in Sample class 1");
        System.out.println(name);
      } 
}

public class Test1{
  public static void main(String[] args) {
    Sample.display();
  }
}
