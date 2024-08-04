public class Main {
  public static void main(String[] args) {
    // Declare and initialize a 2D array
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    // Looping through elements in a 2D array
    System.out.println("Iterating through the 2D array:");
    for (int[] row : matrix) {
      for (int element : row) {
        System.out.println("Element: " + element);
      }
    }
  }
}
