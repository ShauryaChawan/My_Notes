// Superclass
class Animal {
  void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

// Subclass
class Dog extends Animal {
  @Override
  void makeSound() {
    System.out.println("Dog barks");
  }
}

// Another subclass
class Cat extends Animal {
  @Override
  void makeSound() {
    System.out.println("Cat meows");
  }
}

public class Main {
  public static void main(String[] args) {
    // Reference of type Animal
    Animal myAnimal;

    // myAnimal refers to a Dog object
    myAnimal = new Dog();
    myAnimal.makeSound(); // Output: Dog barks

    // myAnimal now refers to a Cat object
    myAnimal = new Cat();
    myAnimal.makeSound(); // Output: Cat meows
  }
}
