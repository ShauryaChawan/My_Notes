@FunctionalInterface
interface Printer {
	void print(String message);
}

public class Main {
	public static void main(String[] args) {
		// Method reference to an instance method
		Printer printer = System.out::println;

		printer.print("Hello, World"); // Outputs: Hello, World
	}
}
