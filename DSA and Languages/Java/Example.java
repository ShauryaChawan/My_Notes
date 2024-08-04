public class Example {
	private int value;

	public Example(int value) {
		this.value = value;
	}

	public Example(Example obj) {
		// Passing the value of the passed object to another constructor
		this(obj.value); 
	}

	public void displayValue() {
		System.out.println("Value: " + value);
	}

	public static void main(String[] args) {
		Example obj1 = new Example(30);
		// Calling the constructor that takes an Example object
		Example obj2 = new Example(obj1); 
		// Outputs: Value: 30
		obj2.displayValue(); 
	}
}
