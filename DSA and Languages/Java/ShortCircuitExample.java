public class ShortCircuitExample {
	public static void main(String[] args) {
		int number = 5;
		if (isNonZero(number) || isPositive(number)) {
			System.out.println("Number is non-zero or positive");
		} else {
			System.out.println("Short-circuited, second condition not evaluated");
		}
	}

	public static boolean isNonZero(int num) {
		System.out.println("Checking if number is non-zero");
		return num != 0;
	}

	public static boolean isPositive(int num) {
		System.out.println("Checking if number is positive");
		return num > 0;
	}
}
