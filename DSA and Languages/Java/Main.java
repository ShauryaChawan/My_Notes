class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
}

public class Main {
	public static void main(String[] args) {
		Person person = createPerson("Alice", 30);
		System.out.println(person);
	}

	// Function returning a non-primitive type (Person)
	public static Person createPerson(String name, int age) {
		return new Person(name, age);
	}
}
