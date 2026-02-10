class Demo1{
    private int r;
    private String name;

    public int getR() {
        return r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setR(int r) {
        this.r = r;
    }

}

public class get {
   public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.setR(101);
        d1.setName("Java");
        System.out.println("Value of r: " + d1.getR());
        System.out.println("Name: " + d1.getName());
    }
}
