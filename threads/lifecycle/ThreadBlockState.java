package threads.lifecycle;

/*
 * If a thread tries to access a synchronized block (critical section) that is locked by another thread, it enters the BLOCKED state.
The thread waits until the lock is released.
 */

class SharedResource {
    synchronized void display() {
        System.out.println(Thread.currentThread().getName() + " is inside synchronized block.");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}

class MyThread extends Thread {
    SharedResource resource;
    int  a;

    MyThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.display();
    }
}

public class ThreadBlockState {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        // obj.display();
        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);

        t1.start();
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        System.out.println("State of t2: " + t2.getState());  // BLOCKED (since t1 has the lock)
        t2.start();

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        System.out.println("State of t2: " + t2.getState()); 
         // BLOCKED (since t1 has the lock)

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        System.out.println("State of t2: " + t2.getState()); 


        /*
         * t2.run() executes and tries to enter display(), but:
The lock is still held by t1.
t2 enters the BLOCKED state and waits for the lock.
         */
    }
}

