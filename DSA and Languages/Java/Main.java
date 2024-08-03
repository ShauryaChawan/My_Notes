class Parent {
	public Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	public Child(int value) {
		super();
		System.out.println("Child constructor with value: " + value);
	}
}

public class Main {
	public static void main(String[] args) {
		// This will cause a compile-time error
		// Parent parent = new Child(); 
		
		// Also not possible without appropriate constructor
		Parent parent = new Child(10); 
	}
}
