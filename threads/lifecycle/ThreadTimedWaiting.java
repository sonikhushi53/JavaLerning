package threads.lifecycle;

/*
 * A thread enters TIMED WAITING when it calls sleep(time), join(time), or wait(time).
The thread waits for a specific time before moving to the runnable state.
 */

class TimedWaitingExample extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is sleeping...");
            Thread.sleep(2000);  // Moves thread to TIMED_WAITING

            System.out.println(Thread.currentThread().getName() + Thread.currentThread().getState());

        } catch (InterruptedException e) {}
    }
}

public class ThreadTimedWaiting {
    public static void main(String[] args) throws InterruptedException {
        TimedWaitingExample t1 = new TimedWaitingExample();
        t1.start();

        Thread.sleep(1000);
        System.out.println("State of t1: " + t1.getState());  // TIMED_WAITING
    }
}

