# Lucky Numbers in a Matrix

Problem Link : [Link](https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/?envType=daily-question&envId=2024-07-19)

## My Code:
```
class Solution {
	public static int[] findMin(int[] row) {
		int minElement = Arrays.stream(row).min().orElseThrow();
		int index = Arrays.binarySearch(row, minElement);
		int[] result = { index, minElement };
		return result;
	}

	public static int findMax(int[] row) {
		int maxElement = Arrays.stream(row).max().orElseThrow();
		int result = maxElement;
		return result;
	}

		public static List<Integer> luckyNumbers(int[][] matrix) {
		int[][] minElements = new int[matrix.length][];
		for (int i = 0; i < matrix.length; i++) {
			minElements[i] = findMin(matrix[i]);
		}

		List<Integer> result = new ArrayList<>();

		boolean pass = true;
		for (int[] i : minElements) {
			if (i[0] != minElements[0][0]) {
				pass = false;
				break;
			}
		}
		if (pass) {
			int[] demo = new int[minElements.length];
			for (int i = 0; i < minElements.length; i++) {
				demo[i] = minElements[i][1];
			}

			int maxElement = findMax(demo);
			result.add(maxElement);
			return result;
		}
		return result;
	}
}
```
The problem with my code is that

## Code by ChatGPT:

```
class Solution {
	public static List<Integer> luckyNumbers(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				boolean isMin = true;
				boolean isMax = true;

				// Check if it's minimum in its row
				for (int k = 0; k < n; k++) {
					if (matrix[i][k] < matrix[i][j]) {
						isMin = false;
						break;
					}
				}

				// If it's minimum in its row, check if it's maximum in its column
				if (isMin) {
					for (int k = 0; k < m; k++) {
						if (matrix[k][j] > matrix[i][j]) {
							isMax = false;
							break;
						}
					}
				}

				// If it's both minimum in its row and maximum in its column, 
				// it's a lucky number
				if (isMin && isMax) {
					result.add(matrix[i][j]);
				}
			}
		}

		return result;
	}
}
```

## Most Optimised Code:

```
class Solution {
	public List<Integer> luckyNumbers(int[][] matrix) {
		List<Integer> lsRes = new ArrayList<>();

		for (int i = 0; i < matrix.length; i++) {
			int col = findMin(matrix, i);

			int maxCol = matrix[i][col];
			if (maxInCol(matrix, maxCol, col))
				lsRes.add(maxCol);
			// for(int r = 0; r < matrix.length; r++)
			// {
			// if(matrix[r][col] > maxCol)
			// maxCol = matrix[r][col];
			// }

			// if(minRow == maxCol)
			// lsRes.add(matrix[i][col]);
		}

		return lsRes;
	}

	private int findMin(int[][] matrix, int row) {
		int val = matrix[row][0], col = 0;
		for (int i = 1; i < matrix[row].length; i++) {
			if (matrix[row][i] < val) {
				val = matrix[row][i];
				col = i;
			}
		}
		return col;
	}

	private boolean maxInCol(int[][] matrix, int val, int col) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] > val)
				return false;
		}
		return true;
	}
}
```