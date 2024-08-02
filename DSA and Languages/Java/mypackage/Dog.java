package mypackage;

// Subclass inheriting from Animal
public class Dog extends Animal {
	void showFields() {
		System.out.println("Inside Dog class:");
		System.out.println("\tpublicField: " + publicField);
		// System.out.println("privateField: Not accessible directly"); // Private field
		// not accessible
		System.out.println("\tprotectedField: " + protectedField);
		System.out.println("\tdefaultField: " + defaultField);
	}
}