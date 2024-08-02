package example3.animals;

// Superclass with different access modifiers
public class Animal {
	public String publicField = "Public field";
	private String privateField = "Private field";
	protected String protectedField = "Protected field";
	String defaultField = "Default field";

	public void display() {
		System.out.println("Inside Animal class:");
		System.out.println("publicField: " + publicField);
		System.out.println("privateField: Not accessible directly");
		System.out.println("protectedField: " + protectedField);
		System.out.println("defaultField: " + defaultField);
	}
}
