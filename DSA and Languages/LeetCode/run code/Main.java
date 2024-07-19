import java.util.*;

public class Main {

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

	public static void main(String[] args) {
		// int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
		int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
		// int[][] matrix = {{3,6},{7,1},{5,2},{4,8}};
		// int[][] matrix = {{3,6}};
		// // int[][] matrix = {{3}};
		// int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };

		List<Integer> result = luckyNumbers(matrix);
		System.out.println("Result: " + result);

		// luckyNumbers(matrix);
	}
}
