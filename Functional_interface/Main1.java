interface Sample2 {
    void display();
}

public class Main1 {
    public static void main(String[] args) {
        Sample2 s = () -> System.out.println("I am in display");

        s.display();
    }
}
