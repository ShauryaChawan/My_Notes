package example3.mainPackage;

import example3.animals.Animal;
import example3.dogs.Dog;

// Main class to demonstrate inheritance and access modifiers
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		// Accessing public and protected fields via inheritance
		dog.display();

		// Accessing inherited fields directly in subclass
		// It cannot be accessed.
		// dog.showFields();
	}
}
