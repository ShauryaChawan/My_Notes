import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.println("The sum of the digits is: " + sumOfDigits(number));

		scanner.close();
	}

	public static int sumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
