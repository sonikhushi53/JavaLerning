package threads.lifecycle;

/*
 * A thread enters the waiting state when it calls wait(), join(), or similar methods without a timeout.
The thread remains waiting indefinitely until another thread signals it (using notify() or notifyAll()).
 */

class WaitingThread extends Thread {
    public void run() {
        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting...");
                wait();  // Moves thread to WAITING state and program control move to next line of start method calling in main thread
                System.out.println(Thread.currentThread().getName() + " is resumed.");
            } catch (InterruptedException e) {}
        }
    }
}

public class ThreadWaitingState {
    public static void main(String[] args) throws InterruptedException {
        WaitingThread t1 = new WaitingThread();
        t1.start();

        Thread.sleep(2000); // Pose main for 1 sec to move t1 in waiting state
        System.out.println("State of t1: " + t1.getState());  // WAITING

        synchronized (t1) {
            t1.notify();  // Resumes the thread
        }
    }
}
