// Custom Exception class
class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message);
  }
}

// Example class that uses the custom exception
class Voter {
  private String name;
  private int age;

  public Voter(String name, int age) throws InvalidAgeException {
    this.name = name;

    if (age < 18) {
      throw new InvalidAgeException("Invalid age for voting: " + age);
    }

    this.age = age;
  }

  public void castVote() {
    System.out.println(name + " has cast the vote.");
  }
}

// Main class to demonstrate custom exception usage
public class Main {
  public static void main(String[] args) {
    try {
      Voter voter1 = new Voter("Alice", 20);
      voter1.castVote(); // Outputs: Alice has cast the vote.

      Voter voter2 = new Voter("Bob", 16); // This will throw InvalidAgeException
      voter2.castVote(); // This line won't execute due to exception
    } catch (InvalidAgeException e) {
      System.out.println("Exception caught: " + e.getMessage());
      // Handle the exception or provide feedback to the user
    }
  }
}
