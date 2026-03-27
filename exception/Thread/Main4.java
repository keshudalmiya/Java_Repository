class Sample implements Runnable {

    public void run() {
        for(int i = 1; i <= 3; i++) {
            
            System.out.println(Thread.currentThread().getName() + " Started - Step " + i);
            
            Thread.yield();  // giving chance to other threads
        }
    }
}

public class Main4 {
    public static void main(String[] args) {

        Sample S1 = new Sample();
        Sample S2 = new Sample();
        Sample S3 = new Sample();

        // Creating threads
        Thread t1 = new Thread(S1, "Thread-1");
        Thread t2 = new Thread(S2, "Thread-2");
        Thread t3 = new Thread(S3, "Thread-3");

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
