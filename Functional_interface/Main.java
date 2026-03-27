interface Add {
    int sum(int a, int b);
}
class AddImpl implements Add {
    public int sum(int a, int b) {
        return a + b;
    }
}
public class Main {
    public static void main(String[] args) {
        Add obj = new AddImpl();

        int result = obj.sum(5, 3);

        System.out.println("Sum = " + result);
    }
}
