class Test implements Runnable{
    public void run(){
        System.out.println("Thread 1");
    }
}
public class Main5{
    public static void main(String[] args) {
        
    
    Test A = new Test();
    Thread T1 = new Thread(A);
    Runnable R = ()-> System.out.println("Thread 2");
    Thread T2 = new Thread(R);
    T1.start();
    T2.start();
}
}
