import java.util.*;

import java.util.*;



class Main {

	public static String[] sortPeople(String[] names, int[] heights) {
		// Step 1: Combine names and heights into a list of pairs (tuples)
		List<Map.Entry<String, Integer>> people = new ArrayList<>();

		for (int i = 0; i < names.length; i++) {
			people.add(new AbstractMap.SimpleEntry<>(names[i], heights[i]));
		}

		// Step 2: Sort the list by height in descending order
		people.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

		// Step 3: Extract the sorted names
		String[] sortedNames = new String[names.length];
		for (int i = 0; i < people.size(); i++) {
			sortedNames[i] = people.get(i).getKey();
		}

		return sortedNames;
	}

	public static void main(String[] args) {

		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
