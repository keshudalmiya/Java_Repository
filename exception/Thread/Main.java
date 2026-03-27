interface MyInterface {
    void show();   // interface method
}

class MyThread extends Thread implements MyInterface {
    
    // Implement interface method
    public void show() {
        System.out.println("Interface method called");
    }
    
    // Thread task
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        
        MyThread obj = new MyThread();
        
        obj.show();   // calling interface method
        
        obj.start();  // starting thread
    }
}
