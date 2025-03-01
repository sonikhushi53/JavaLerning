package oops;

class Parent {
    final void show() {
        System.out.println("Parent's method");
    }
}

class Child extends Parent {
    // @Override
    void show() { //  Error! Can't override final method
        System.out.println("Child's method");
    }
}

public class finalMethod {
    public static void main(String[] args) {
        Child c =new Child();
        c.show();
    }
}
