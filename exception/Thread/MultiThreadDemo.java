class ThreadA extends Thread {

    public void run() {
        System.out.println("Thread A is running");
    }
}

class ThreadB extends Thread {

    public void run() {
        System.out.println("Thread B is running");
    }
}

class ThreadC extends Thread {

    public void run() {
        System.out.println("Thread C is running");
    }
}

public class MultiThreadDemo {

    public static void main(String args[]) {

        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        ThreadC t3 = new ThreadC();

        t1.start();

        try {
            Thread.sleep(1000);   // pause current thread
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
// join get sleep getname setname priority 