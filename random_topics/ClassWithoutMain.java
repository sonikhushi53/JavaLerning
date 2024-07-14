package random_topics;

public class ClassWithoutMain {
    void HelloWorld(){
        System.out.println("Hello This is hello world method ");
    }
}
// Give error at run time

// PS D:\Java program> javac random_topics/ClassWithoutMain.java
// PS D:\Java program> java random_topics/ClassWithoutMain
// Error: Main method not found in class random_topics.ClassWithoutMain, please define the main method as:
//    public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application