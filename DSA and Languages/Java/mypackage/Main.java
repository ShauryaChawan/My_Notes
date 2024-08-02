package mypackage;

// Main class to demonstrate inheritance and access modifiers
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		// Accessing public, protected, and default fields via inheritance
		dog.display(); 
		// Accessing inherited fields directly in subclass
		dog.showFields(); 
	}
}