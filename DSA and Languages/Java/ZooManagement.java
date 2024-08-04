import java.util.ArrayList;
import java.util.List;

class Animal {
  public void feed() {
    System.out.println("Feeding animal...");
  }

  public double getWeight() {
    return 10.0; // Default weight
  }
}

class Mammal extends Animal {
  @Override
  public void feed() {
    System.out.println("Feeding mammal...");
  }
}

class Bird extends Animal {
  @Override
  public void feed() {
    System.out.println("Feeding bird...");
  }
}

class Elephant extends Mammal {
  @Override
  public void feed() {
    System.out.println("Feeding elephant...");
  }

  @Override
  public double getWeight() {
    return 5000.0; // Weight in kg
  }
}

class Tiger extends Mammal {
  @Override
  public void feed() {
    System.out.println("Feeding tiger...");
  }

  @Override
  public double getWeight() {
    return 300.0; // Weight in kg
  }
}

class Parrot extends Bird {
  @Override
  public void feed() {
    System.out.println("Feeding parrot...");
  }

  @Override
  public double getWeight() {
    return 1.0; // Weight in kg
  }
}

class Eagle extends Bird {
  @Override
  public void feed() {
    System.out.println("Feeding eagle...");
  }

  @Override
  public double getWeight() {
    return 5.0; // Weight in kg
  }
}

public class ZooManagement {

  // Unbounded wildcard example: Print the list of animals
  public static void printAnimals(List<?> animals) {
    for (Object animal : animals) {
      System.out.println(animal.getClass().getSimpleName());
    }
  }

  // Upper bounded wildcard example: Calculate total weight of animals
  public static double calculateTotalWeight(List<? extends Animal> animals) {
    double totalWeight = 0;
    for (Animal animal : animals) {
      totalWeight += animal.getWeight();
    }
    return totalWeight;
  }

  // Lower bounded wildcard example: Add animals to the list
  public static void addAnimals(List<? super Mammal> animals) {
    animals.add(new Elephant());
    animals.add(new Tiger());
  }

  public static void main(String[] args) {
    // Create lists of animals
    List<Animal> animals = new ArrayList<>();
    animals.add(new Elephant());
    animals.add(new Tiger());
    animals.add(new Parrot());
    animals.add(new Eagle());

    List<Mammal> mammals = new ArrayList<>();
    mammals.add(new Elephant());
    mammals.add(new Tiger());

    // Unbounded wildcard: Print all animals
    System.out.println("Animals in the zoo:");
    printAnimals(animals);

    // Upper bounded wildcard: Calculate total weight of all animals
    double totalWeight = calculateTotalWeight(animals);
    System.out.println("Total weight of animals: " + totalWeight + " kg");

    // Lower bounded wildcard: Add new mammals to the list
    addAnimals(mammals);
    System.out.println("Mammals in the zoo after adding new animals:");
    printAnimals(mammals);
  }
}
