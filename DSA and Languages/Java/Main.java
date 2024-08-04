import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter a string:");
    // Read input from the user
    String input = reader.readLine();

    // Display the input
    System.out.println("You entered: " + input);
  }
}
