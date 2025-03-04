package threads;

class MyRunnable implements Runnable {
    // public void run() throws RuntimeException {  // ❌ Not Allowed
    public void run() {  
        // Thread.sleep(1000);
        System.out.println("Thread executed.");
    }

    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        // Thread t = new Thread(new MyRunnable());
        Thread t = new Thread(mr, "Name");

        // t.setUncaughtExceptionHandler((thread, exception)->{
        //     System.out.println("Exception caught from " + thread.getName() + ": " + exception.getMessage());
        // });
        t.start();

    }
}

