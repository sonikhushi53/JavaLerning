package threads.lifecycle;

/*
 * When a thread is created using Thread or Runnable, but start() is not called yet.
The thread is in the new state.
 */
class MyThread extends Thread {

    public void counting(){
        // Print 1 -10
    }
    public void run() {
        System.out.println("Thread is running..." + Thread.currentThread().getName());
        System.out.println("Thread is running state is... " + Thread.currentThread().getState());
        
    }
}

public class ThreadNewState {
    public static void main(String[] args) {
        MyThread t = new MyThread();  // Thread created (NEW state)
        System.out.println(t.getState());
        t.start();
        try {
            Thread.sleep(100);
            
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        System.out.println(t.getState());

        // try{
            // t.start();
        // } catch (Exception e){
        //     System.out.println(e);
        // }
        // t.run();
        // t.run();

        // System.out.println("State: " + t.getState());  // NEW
    }
}
