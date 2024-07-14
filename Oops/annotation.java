package Oops;

// Define the Custom Annotation
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface SpecialMethod {
}

// Apply the Custom Annotation to Specific Methods
class MyClass {
    @SpecialMethod
    public void specialMethod1() {
        System.out.println("Special Method1 invoked!");
    }

    @SpecialMethod
    public void specialMethod2() {
        System.out.println("Special Method2 invoked!");
    }

    public void regularMethod() {
        System.out.println("Regular Method invoked!");
    }
}

// Use Reflection to Invoke Only Annotated Methods
public class annotation {
    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            for (Method method : MyClass.class.getDeclaredMethods()) {
                if (method.isAnnotationPresent(SpecialMethod.class)) {
                    method.invoke(instance);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
