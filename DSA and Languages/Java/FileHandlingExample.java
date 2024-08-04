import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingExample {

  public static void main(String[] args) {
    // Replace with the path to an existing file on your system
    String filePath = "path/to/your/file.txt";

    try {
      readFileContents(filePath);
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e.getMessage());
      // Optionally, handle the exception or rethrow it
    } catch (Exception e) {
      System.err.println("Exception occurred: " + e.getMessage());
    } finally {
      System.out.println("Executing finally block.");
      // Close any resources here, if needed
    }

    System.out.println("End of program.");
  }

  public static void readFileContents(String filePath) throws FileNotFoundException {
    File file = new File(filePath);
    Scanner scanner = new Scanner(file);

    try {
      // Read file contents line by line
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
    } finally {
      // Close the scanner in the finally block to ensure it gets closed
      if (scanner != null) {
        scanner.close();
      }
    }
  }
}
