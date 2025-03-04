package threads.lifecycle;

class MyThread extends Thread{
    // MyThread(String name){
    //     super(name);
    // }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class SetName {
    public static void main(String[] args) {
        // MyThread t1 = new MyThread("My thread");
        MyThread t1 = new MyThread();

        t1.setName("My the");
        t1.start();
    }
}
