class Addition {
    int a, b;
    Addition() {
        this.a = 0;
        this.b = 0;
    }
    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void calsum(Addition A1, Addition A2) {
        this.a = A1.a + A2.a;
        this.b = A1.b + A2.b;
        System.out.println(S.a + " " + S.b);
    }
    void display() {
        System.out.println(a + " " + b);
    }
    

}
public class addition_constructor {
    public static void main(String[] args) {
        Addition A1 = new Addition(10, 20);
        Addition A2 = new Addition(30, 40);
        Addition S = new Addition();
        S.calsum(A1, A2);
        S.display();
    }
}
