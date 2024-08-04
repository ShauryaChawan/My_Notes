class Animal {
  String color = "white";

  Animal() {
    System.out.println("Animal is created");
  }

  void eat() {
    System.out.println("Animal is eating");
  }
}

class Dog extends Animal {
  String color = "black";

  Dog() {
    // super(); // Calling superclass constructor
    System.out.println("Dog is created");
  }

  void displayColor() {
    // Accessing superclass field
    System.out.println(super.color); 
  }

  void eat() {
    super.eat(); // Calling superclass method
    System.out.println("Dog is eating");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.displayColor();
    d.eat();
  }
}

// Output:
// ----------
// Animal is created
// Dog is created
// white
// Animal is eating
// Dog is eating