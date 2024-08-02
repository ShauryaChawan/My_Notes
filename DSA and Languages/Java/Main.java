// Superclass
class Animal {
	private String species;

	// Superclass constructor with one parameter
	public Animal(String species) {
		this.species = species;
		System.out.println("Animal constructor with species: " + species);
	}

	// Getter method for species
	public String getSpecies() {
		return species;
	}
}

// Subclass inheriting from Animal
class Dog extends Animal {
	private String name;

	// Subclass constructor with two parameters
	public Dog(String species, String name) {
		super(species); // Call to superclass constructor
		this.name = name;
		System.out.println("Dog constructor with name: " + name);
	}

	// Getter method for name
	public String getName() {
		return name;
	}
}

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Canine", "Buddy");
		System.out.println("Species: " + dog.getSpecies());
		System.out.println("Name: " + dog.getName());
	}
}
