[🏠 Home](../../README.md)

<hr>

# 2418. Sort the People

Problem Statement: <a href="https://leetcode.com/problems/sort-the-people/description/?envType=daily-question&envId=2024-07-22">Link</a>

## My Code
```
class Solution {
	public String[] sortPeople(String[] names, int[] heights) {
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
}
```

## Most Optimised Code:
```
class Solution {
	private <T> void insertionSortReverseOrder(int[] main, T[] side, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (main[j + 1] > main[j]) { // reverse order
					int t = main[j + 1];
					main[j + 1] = main[j];
					main[j] = t;

					T tT = side[j + 1];
					side[j + 1] = side[j];
					side[j] = tT;
				} else
					break;
			}
		}
	}

	private <T> void quickSortReverseOrder(int[] main, T[] side, int left, int right) {
		if (left >= right)
			return;
		if (right - left <= 11) {
			// Do insertion sort
			insertionSortReverseOrder(main, side, left, right);
			return;
		}
		// Choose pivot of median between left, left+1, left+2
		int pivot;
		{
			int aV = main[left], bV = main[left + 1], cV = main[left + 2];
			if (aV <= bV && aV <= cV) {
				// a is smallest
				pivot = bV <= cV ? (left + 1) : (left + 2);
			} else if (bV <= aV && bV <= cV) {
				// b is smallest
				pivot = aV <= cV ? (left) : (left + 2);
			} else {
				// c is smallest
				pivot = aV <= bV ? (left) : (left + 1);
			}
		}

		int val = main[pivot];
		{ // swap pivot with right
			main[pivot] = main[right];
			main[right] = val;
		}
		{
			T x = side[pivot];
			side[pivot] = side[right];
			side[right] = x;
		}
		int L = left, R = right - 1;
		while (true) {
			while (L <= R && main[L] >= val)
				L++; // Reverse order
			while (L <= R && main[R] <= val)
				R--;
			if (L < R) {
				{ // swap idx L and R
					int z = main[L];
					main[L] = main[R];
					main[R] = z;
				}
				{
					T z = side[L];
					side[L] = side[R];
					side[R] = z;
				}
				L++;
				R--;
			} else {
				break;
			}
		}
		{ // swap idx L and right
			int z = main[L];
			main[L] = main[right];
			main[right] = z;
		}
		{
			T z = side[L];
			side[L] = side[right];
			side[right] = z;
		}
		quickSortReverseOrder(main, side, left, L - 1);
		quickSortReverseOrder(main, side, L + 1, right);
	}

	public String[] sortPeople(String[] names, int[] heights) {
		quickSortReverseOrder(heights, names, 0, names.length - 1);
		return names;
	}
}
```

<hr>

[🏠 Home](../../README.md)

