package Oops;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// needed for refletion
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface SpecialMethod {
    int order();
}

// Apply the Custom Annotation with Order Values
class MyClass {
    @SpecialMethod(order = 4)
    public void specialMethod1() {
        System.out.println("Special Method1 invoked!");
    }

    @SpecialMethod(order = 2)
    public void specialMethod2() {
        System.out.println("Special Method2 invoked!");
    }

    @SpecialMethod(order = 3)
    public void specialMethod3() {
        System.out.println("Special Method3 invoked!");
    }
}

// Use Reflection to Invoke Annotated Methods in Order
public class anotationWithOrder {
    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            // It getting the name of all methods in Myclass
            Method[] methods = MyClass.class.getDeclaredMethods(); 
            
            // Filter methods with @SpecialMethod and sort by order attribute
            Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(SpecialMethod.class))
                .sorted(Comparator.comparingInt(method -> method.getAnnotation(SpecialMethod.class).order()))
                .forEach(method -> {
                    try {
                        method.invoke(instance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
