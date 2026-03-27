class Overload{
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    double add(int a, double b){
        return a + b;
    }

}
public class method_overloading {
    public static void main(String[] args) {
        Overload o = new Overload();
        System.out.println(o.add(10, 20));
        System.out.println(o.add(10, 20, 30));
        System.out.println(o.add(10, 20.5));
    }
}
