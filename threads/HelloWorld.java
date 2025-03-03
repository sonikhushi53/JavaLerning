package threads;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Thread t = Thread.currentThread();
        System.out.println(t.getName()); // Return main as current thread
        System.out.println(t.getPriority());

    }   
}
