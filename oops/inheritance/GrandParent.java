package oops.inheritance;


// Think of inheritance in Java like a family hierarchy:

// Grandfather (Grandparent Class) → Owns an old family treasure locked in a box.
// Father (Parent Class) → Has the key to the treasure.
// Son (Child Class) → Wants access to the treasure.


// Imagine a corporate company hierarchy:

// CEO (Grandparent Class) → Makes high-level decisions.
// Manager (Parent Class) → Handles department-level operations.
// Employee (Child Class) → Works on assigned tasks.



// filename Main.java
class Grandparent {
	public void print()
	{
		System.out.println("Grandparent's print()");
	}
}

class Parent extends Grandparent {
	public void print()
	{
		System.out.println("Parent's print()");
	}
}

class Child extends Parent {
	public void print()
	{
		// Trying to access Grandparent's print()
		// super.super.print(); // Generate error  instend this we can do chaining

		super.print();
        // Java does not allow direct access to grandparent members using super.super to maintain encapsulation 
        // and avoid breaking inheritance hierarchy.

		System.out.println("Child's print()");
	}
}

public class GrandParent {
	public static void main(String[] args)
	{
		Child c = new Child();
		c.print();
	}
}

