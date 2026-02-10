class Demo{
   private int r;
   private String name;
    void getdata(int r, String name){
        this.r = r;
        this.name = name;
    }
    void show (){
        System.out.println("r " + r);
        System.out.println("Name: " + name);
    }
}
public class Main6 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.getdata(101, "Java");
        d1.show();
    }
}
