import java.util.*;
import java.math.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];

    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }

    Arrays.sort(s, 0, n, new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        // Sort in descending order using BigDecimal
        return new BigDecimal(b).compareTo(new BigDecimal(a));
      }
    });

    // Output the sorted array
    for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
  }
}
