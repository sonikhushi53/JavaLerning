package threads.lifecycle;


/*
 * When the CPU assigns time to the thread, it starts executing.
The thread moves from runnable → running state.

 */
class MyThread extends Thread {
    public void run() {
        System.out.println("State in run(): " + Thread.currentThread().getState());  // RUNNING
    }
}

public class ThreadRunningState {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

