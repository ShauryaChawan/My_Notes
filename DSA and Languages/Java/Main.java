public class Main {
	public static void main(String[] args) {
byte byteVal = 10;
short shortVal = 20;
int intVal = 30;
long longVal = 40L;
float floatVal = 50.5f;
double doubleVal = 60.5;

// byte, short, or char promoted to int
int result = byteVal * byteVal * byteVal; // byte and short promoted to int
System.out.println("Result of byte * byte * byte: " + result);

// byte, short, and char promoted to int
int result1 = byteVal + shortVal; // byte and short promoted to int
System.out.println("Result of byte + short: " + result1);

// int promoted to long
long result2 = intVal + longVal; // int promoted to long
System.out.println("Result of int + long: " + result2);

// float promoted to double
double result3 = floatVal + doubleVal; // float promoted to double
System.out.println("Result of float + double: " + result3);

// Combining int and double, int promoted to double
double result4 = intVal + doubleVal;
System.out.println("Result of int + double: " + result4);

// Explicit casting to demonstrate narrowing conversion
int result5 = (int) (floatVal + doubleVal); // float and double promoted to double, then cast to int
System.out.println("Result of casting (float + double) to int: " + result5);
	}
}
