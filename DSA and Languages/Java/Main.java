public class Main {
	public static void main(String[] args) {
int row = 1;
do {
	int col = 1;
	do {
		if ((row + col) % 2 == 0) {
			System.out.print("E\t"); // Even sum
		} else {
			System.out.print("O\t"); // Odd sum
		}
		col++;
	} while (col <= 5);
	System.out.println(); // Move to the next line after each row
	row++;
} while (row <= 5);
	}
}
