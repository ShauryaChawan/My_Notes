interface Greeting {
	void greet();
}

public class Main {
	public static void main(String[] args) {
		// Anonymous class implementing Greeting interface
		Greeting greeting = new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hello, Anonymous!");
			}
		};

		greeting.greet(); 
	}
}

// Outputs: Hello, Anonymous!