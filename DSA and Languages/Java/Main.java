class Animal {
	public void makeSound() {
		System.out.println("Some generic animal sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
}
