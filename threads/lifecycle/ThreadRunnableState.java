package threads.lifecycle;

/*
 * After calling start(), the thread moves to the runnable state.
The thread is ready to run, but the CPU has not assigned time for execution yet.
 */
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadRunnableState {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();  // Thread is now in RUNNABLE state
        System.out.println("State: " + t.getState());  // RUNNABLE (or RUNNING if it starts instantly)
    }
}
