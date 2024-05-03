package Oops;

import java.lang.instrument.Instrumentation;

class ObjectSizeFetcher {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}

public class getSizeOfObject {
    private int x;
    private int y;

    public static void main(String [] args) {
        System.out.println(ObjectSizeFetcher.getObjectSize(new getSizeOfObject()));
    }
}

// Running file showing error Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.instrument.Instrumentation.getObjectSize(Object)" because "Oops.ObjectSizeFetcher.instrumentation" is null
        // at Oops.ObjectSizeFetcher.getObjectSize(getSizeOfObject.java:13)
        // at Oops.getSizeOfObject.main(getSizeOfObject.java:22)