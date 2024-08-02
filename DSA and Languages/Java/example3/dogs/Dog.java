package example3.dogs;

import example3.animals.Animal;

// Subclass inheriting from Animal in a different package
public class Dog extends Animal {
	void showFields() {
		System.out.println("Inside Dog class:");
		
		System.out.println("publicField: " + publicField);
		
		// Private field not accessible
		// System.out.println("privateField: Not accessible directly"); 
		
		System.out.println("protectedField: " + protectedField);
		
		// Default field not accessible
		// System.out.println("defaultField: " + defaultField); 
	}
}
