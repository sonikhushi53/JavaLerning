import java.io.*; 
class Animal { 
    public void eat() 
    { 
        System.out.println("The animal is eating."); 
    } 
} 
  
class Cat extends Animal { 
    public void meow() 
    { 
        System.out.println("The cat is meowing."); 
    } 

    // public void eat() 
    // { 
    //     System.out.println("The cat is eating."); 
    // } 
} 
  
class ExplicitDowncast { 
    public static void main(String[] args) 
    { 
        Animal animal = new Cat(); 
        animal.eat();
        
        // animal.meow();  // can't call bcoz need to explicity convert for calling a method that not in parent
        
  
        // Explicit downcasting 
        Cat cat = (Cat)animal; 
        cat.eat(); 

        
    } 
}