class Student {
   static String clg = "ABES";
   int r;
    String name;
    static int count = 0;
    void getdata(int r, String name) {
        this.r = r;
        this.name = name;
        count++;
    }
    void display() {
        System.out.println("count: " + count);
        System.out.println("College: " + clg);
        System.out.println("Roll No: " + r);
        System.out.println("Name: " + name);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getdata(1, "Keshu");
        s1.display();
        Student s2 = new Student();
        s2.getdata(2, "Aman");
        s2.display();
    }
}
