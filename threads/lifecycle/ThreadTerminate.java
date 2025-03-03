package threads.lifecycle;

/*
 * Once a thread finishes execution, it moves to the terminated state.
A terminated thread cannot be restarted.
 */


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadTerminate {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        Thread.sleep(100);
        System.out.println("State of t1: " + t1.getState());  // TERMINATED
    }
}
