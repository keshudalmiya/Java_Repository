interface Example2{
    void display();
}

public class Main7{
    int a;

    Main7(int a){
        this.a = a;
    }

    void show(){
        Example2 E2 = () -> System.out.println(a);
        E2.display();
    }

    public static void main(String[] args) {
        Main7 M1 = new Main7(10); // fixed
        M1.show();
    }
}
