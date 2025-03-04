package threads;

class PriorityThread extends Thread {

    // public void run() throws RuntimeException{ allowed
// Exception InterruptedException is not compatible with throws clause in Thread.run()
    public void run()  {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
        // int a = 10/0;
    }

    public static void main(String[] args) {
        
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        // System.out.println("t1 is alive -: "+t1.isAlive()); //false

        // Setting different priorities
        // t1.setUncaughtExceptionHandler((thread, exception)->{
        //     System.out.println("Exception caught from " + thread.getName() + ": " + exception.getMessage());
        // });
        
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.setPriority(Thread.MIN_PRIORITY);  // Priority = 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority = 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority = 10
        // Thread.currentThread().setPriority(11);
        t1.start();
        t2.start();
        t3.start();
        // System.out.println("t1 is alive -: "+t1.isAlive()); true

        System.out.println("Hello from thread "+ Thread.currentThread().getName() +" with priority- "+ Thread.currentThread().getPriority());

    }
}

