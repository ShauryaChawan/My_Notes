public class MultiDimensionalArrayExample {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    // Passing the 2D array to a method
    printMatrix(matrix);
  }

  // Method to print elements of the 2D array
  public static void printMatrix(int[][] arr) {
    for (int[] row : arr) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
