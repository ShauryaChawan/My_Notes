public class GCExample {
  public static void main(String[] args) {
    // Creating objects
    for (int i = 0; i < 10000; i++) {
      Object obj = new Object();
      if (i % 1000 == 0) {
        System.out.println("Iteration: " + i);
        System.gc(); // Request garbage collection
      }
    }
    System.out.println("End of program.");
  }
}
