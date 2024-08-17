import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Create and populate a HashMap
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("banana", 2);
    hashMap.put("apple", 5);
    hashMap.put("orange", 3);
    hashMap.put("grape", 1);
    hashMap.put("peach", 4);

    // Print the unsorted HashMap
    System.out.println("Unsorted HashMap: " + hashMap);

    // Convert the HashMap to a List of Map.Entry
    List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

    // Sort the list using a custom comparator (by value)
    list.sort(Map.Entry.comparingByValue());

    // Create a LinkedHashMap to store the sorted entries
    LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
    for (Map.Entry<String, Integer> entry : list) {
      sortedMap.put(entry.getKey(), entry.getValue());
    }

    // Print the sorted LinkedHashMap
    System.out.println("Sorted LinkedHashMap (by values): " + sortedMap);
  }
}
