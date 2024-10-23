# Common Interview Coding Questions

## Index
- [Common Interview Coding Questions](#common-interview-coding-questions)
	- [Index](#index)
	- [Coding Questions on Numbers](#coding-questions-on-numbers)
		- [1. Prime Number Check](#1-prime-number-check)
		- [2. Palindrome Number](#2-palindrome-number)
		- [3. Fibonacci Sequence](#3-fibonacci-sequence)
		- [4. Factorial of a Number](#4-factorial-of-a-number)
		- [5. Armstrong Number](#5-armstrong-number)
		- [6. GCD and LCM](#6-gcd-and-lcm)
		- [7. Sum of Digits](#7-sum-of-digits)
		- [8. Count Number of Digits](#8-count-number-of-digits)
		- [9. Reverse a Number](#9-reverse-a-number)
		- [10. Convert Decimal to Binary](#10-convert-decimal-to-binary)
		- [11. Check if Power of Two](#11-check-if-power-of-two)
		- [12. Find Missing Number](#12-find-missing-number)
		- [13. Sum of All Prime Numbers](#13-sum-of-all-prime-numbers)
		- [14. Perfect Number Check](#14-perfect-number-check)
		- [15. Trailing Zeroes in Factorial](#15-trailing-zeroes-in-factorial)
		- [16. Neon Number Check](#16-neon-number-check)
	- [Coding Questions on Strings](#coding-questions-on-strings)
		- [1. Reverse a String](#1-reverse-a-string)
		- [2. Check if Palindrome](#2-check-if-palindrome)
		- [3. Count the Occurrence of Each Character](#3-count-the-occurrence-of-each-character)
		- [4. Remove Duplicates from String](#4-remove-duplicates-from-string)
		- [5. Find First Non-Repeating Character](#5-find-first-non-repeating-character)
		- [6. Check if Anagram](#6-check-if-anagram)
		- [7. Check if Substring Exists](#7-check-if-substring-exists)
		- [8. Longest Palindromic Substring](#8-longest-palindromic-substring)
		- [9. String Compression](#9-string-compression)
		- [10. Convert Roman to Integer](#10-convert-roman-to-integer)
		- [11. Longest Common Prefix](#11-longest-common-prefix)
		- [12. Check for Balanced Parentheses](#12-check-for-balanced-parentheses)
		- [13. Count Words in a String](#13-count-words-in-a-string)
		- [14. Permutations of a String](#14-permutations-of-a-string)
		- [15. Check if Strings are Rotation of Each Other](#15-check-if-strings-are-rotation-of-each-other)
		- [16. Convert String to Integer (atoi)](#16-convert-string-to-integer-atoi)
		- [17. Find the Longest Substring Without Repeating Characters](#17-find-the-longest-substring-without-repeating-characters)
		- [18. Check if Two Strings are Isomorphic](#18-check-if-two-strings-are-isomorphic)
		- [19. String Rotation (Cyclic Shift)](#19-string-rotation-cyclic-shift)
		- [20. Valid Parentheses String](#20-valid-parentheses-string)
	- [Coding Questions on Arrays](#coding-questions-on-arrays)
		- [1. Find the Largest Element](#1-find-the-largest-element)
		- [2. Reverse an Array](#2-reverse-an-array)
		- [3. Find the Second Largest Element](#3-find-the-second-largest-element)
		- [4. Array Rotation](#4-array-rotation)
		- [5. Find the Missing Number](#5-find-the-missing-number)
		- [6. Find Duplicates in an Array](#6-find-duplicates-in-an-array)
		- [7. Merge Two Sorted Arrays](#7-merge-two-sorted-arrays)
		- [8. Find the Majority Element](#8-find-the-majority-element)
		- [9. Subarray with Given Sum](#9-subarray-with-given-sum)
		- [10. Move All Zeros to End](#10-move-all-zeros-to-end)
		- [11. Sort an Array of 0s, 1s, and 2s](#11-sort-an-array-of-0s-1s-and-2s)
		- [12. Find the Intersection of Two Arrays](#12-find-the-intersection-of-two-arrays)
		- [13. Kadane's Algorithm](#13-kadanes-algorithm)
		- [14. Find Pairs with Given Sum](#14-find-pairs-with-given-sum)
		- [15. Stock Buy and Sell Problem](#15-stock-buy-and-sell-problem)
		- [1.6 Cyclically Rotate Array by One](#16-cyclically-rotate-array-by-one)
		- [17. Check if Array is Sorted](#17-check-if-array-is-sorted)
		- [19. Find the Maximum Product of Two Integers](#19-find-the-maximum-product-of-two-integers)
		- [20. Find the Longest Consecutive Subsequence](#20-find-the-longest-consecutive-subsequence)
		- [21. Find the Minimum Element in a Rotated Sorted Array](#21-find-the-minimum-element-in-a-rotated-sorted-array)


## Coding Questions on Numbers

### 1. Prime Number Check

- Write a program to check if a number is prime.

```java
public static boolean isPrime(int number) {
		if (number <= 1) {
				// 0 and 1 are not prime numbers
				return false; 
		}
		// Check for factors from 2 to the square root of the number
		for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
						// Found a factor, not prime
						return false; 
				}
		}
		// No factors found, number is prime
		return true; 
}
```

### 2. Palindrome Number

- Check if a given number is a palindrome.

```java
public static boolean isPalindrome(int number) {
    int originalNumber = number;
    int reversedNumber = 0;

    while (number > 0) {
			// Get the last digit
        int digit = number % 10; 
				// Build the reversed number
        reversedNumber = reversedNumber * 10 + digit; 
				// Remove the last digit
        number /= 10; 
    }

		// Check if original and reversed are the same
    return originalNumber == reversedNumber; 
}
```

---

### 3. Fibonacci Sequence

- Write a program to generate the first n Fibonacci numbers.

- Iterative Code

```java
public static int[] fibonacciIterative(int n) {
    int[] fibonacci = new int[n];
    if (n >= 1) fibonacci[0] = 0; // First Fibonacci number
    if (n >= 2) fibonacci[1] = 1; // Second Fibonacci number
    for (int i = 2; i < n; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }
    return fibonacci;
}
```

- Recursive Code

```java
public static int fibonacciRecursive(int n) {
    if (n <= 1) return n; // Base cases
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}
```

---

### 4. Factorial of a Number

- Write a program to calculate the factorial of a number using both recursion and iteration.

```java
public static long factorialIterative(int n) {
	long result = 1;
	for (int i = 2; i <= n; i++) {
		result *= i; // Multiply result by i
	}
	return result;
}
```

---

### 5. Armstrong Number

- Check if a given number is an Armstrong number.
- An Armstrong number (also known as a narcissistic number) for a given number of digits is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
- Example
  - 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
  - 9474 is also an Armstrong number because 9^4 + 4^4 + 7^4 + 4^4 = 9474.

```java
public static boolean isArmstrong(int number) {
	int originalNumber = number;
	int sum = 0;
	int digits = String.valueOf(number).length(); 
	// Count the number of digits

	// Calculate the sum of the digits raised to the power of the number of digits
	while (number > 0) {
		int digit = number % 10; // Get the last digit
		// Raise the digit to the power of digits and add to sum
		sum += Math.pow(digit, digits); 
		number /= 10; // Remove the last digit
	}

	// Check if the sum is equal to the original number
	return sum == originalNumber;
}
```

---

### 6. GCD and LCM

- Write a program to compute the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers.

```java
public static int computeGCD(int a, int b) {
	while (b != 0) {
		int temp = b;
		b = a % b;
		a = temp;
	}
	return a; // GCD is in 'a' when b becomes 0
}

// Method to compute LCM using GCD
public static int computeLCM(int a, int b) {
	return (a * b) / computeGCD(a, b); // LCM formula
}
```

---

### 7. Sum of Digits

- Find the sum of the digits of a number.

```java
public static int sumOfDigits(int number) {
	int sum = 0;
	while (number > 0) {
		sum += number % 10;
		number /= 10;
	}
	return sum;
}
```

---

### 8. Count Number of Digits

- Write a program to count the number of digits in a given number.

```java
public static int countDigits(int number) {
    int count = 0;
    while (number != 0) {
        number /= 10;
        count++;
    }
    return count;
}
```

---

### 9. Reverse a Number

- Reverse the digits of a given number.

```java
public static int reverseNumber(int number) {
    int reversed = 0;
    while (number != 0) {
        reversed = reversed * 10 + number % 10;
        number /= 10;
    }
    return reversed;
}

```

---

### 10. Convert Decimal to Binary

- Write a program to convert a decimal number to binary.

```java
public static int decimalToBinary(int number) {
    int binary = 0;
    int place = 1;
    
    while (number > 0) {
        int remainder = number % 2;
        binary += remainder * place;
        number /= 2;
        place *= 10;  // Shift place to the left
    }
    
    return binary;
}
```

---

### 11. Check if Power of Two

- Write a program to check if a given number is a power of two.

```java
public static boolean isPowerOfTwo(int number) {
    if (number <= 0) return false;
    while (number % 2 == 0) {
        number /= 2;
    }
    return number == 1;
}
```

---

### 12. Find Missing Number

- In a given array of numbers from 1 to n, one number is missing. Find that number.

```java
```

---

### 13. Sum of All Prime Numbers

- Find the sum of all prime numbers up to a given number.

```java
```

---

### 14. Perfect Number Check

- Check if a given number is a perfect number (sum of divisors equals the number).

```java
```

---

### 15. Trailing Zeroes in Factorial

- Write a program to count the number of trailing zeroes in the factorial of a number.

```java
```

---

### 16. Neon Number Check

- Write a program to check if a number is neon (the sum of the digits of the square of that number = number) or not.

```java
public static boolean isNeon(int number) {
    int square = number * number;
    int sumOfDigits = 0;

    while (square > 0) {
        sumOfDigits += square % 10;
        square /= 10; 
    }

    return sumOfDigits == number;
}
```

---

## Coding Questions on Strings

### 1. Reverse a String

- Write a program to reverse a given string.

```java
public static String reverseString(String str) {
    String reversed = "";
    
    for (int i = str.length() - 1; i >= 0; i--) {
				// Append each character in reverse order
        reversed += str.charAt(i); 
    }
    
    return reversed;
}
```

---

### 2. Check if Palindrome

- Check if a given string is a palindrome.

```java
public static boolean isPalindrome(String str) {
    int left = 0; 
    int right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false; // Not a palindrome
        }
        left++;
        right--;
    }
    
    return true; // It's a palindrome
}
```

---

### 3. Count the Occurrence of Each Character

- Write a program to count the occurrence of each character in a string.

```java
import java.util.HashMap;

public static HashMap<Character, Integer> countCharacterOccurrences(String str) {
    HashMap<Character, Integer> characterCount = new HashMap<>();

    for (char c : str.toCharArray()) {
			// Increment the count
        characterCount.put(c, characterCount.getOrDefault(c, 0) + 1); 
    }

		// Return the map with character counts
    return characterCount; 
}
```

---

### 4. Remove Duplicates from String

- Write a function to remove all duplicate characters from a string.

```java
public static String removeDuplicates(String str) {
    StringBuilder result = new StringBuilder();
    boolean[] charSet = new boolean[256]; // Assuming ASCII

    for (char c : str.toCharArray()) {
        if (!charSet[c]) { // Check if character is not already in result
            charSet[c] = true; // Mark character as seen
            result.append(c); // Append to result
        }
    }

    return result.toString(); // Return the result as a string
}

```

---

### 5. Find First Non-Repeating Character

- Find the first non-repeating character in a string.

```java
public static Character firstNonRepeatingCharacter(String str) {
    int[] charCount = new int[256]; // Assuming ASCII

    // Count occurrences of each character
    for (char c : str.toCharArray()) {
        charCount[c]++;
    }

    // Find the first non-repeating character
    for (char c : str.toCharArray()) {
        if (charCount[c] == 1) {
					// Return the first non-repeating character
            return c; 
        }
    }

		// Return null if no non-repeating character is found
    return null; 
}
```

---

### 6. Check if Anagram

- Write a program to check if two strings are anagrams.
- An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once. 
- The resulting arrangement must make sense as a valid word or phrase.
- Examples of Anagrams:
  - "listen" and "silent"
  - "evil" and "vile"
  - "triangle" and "integral"
  - "dusty" and "study"

```java
import java.util.Arrays;

public static boolean areAnagrams(String str1, String str2) {
    // Remove spaces and convert to lowercase for case-insensitive comparison
    str1 = str1.replaceAll("\\s+", "").toLowerCase();
    str2 = str2.replaceAll("\\s+", "").toLowerCase();

    // Check if lengths are different
    if (str1.length() != str2.length()) {
        return false; // Not anagrams if lengths differ
    }

    // Convert strings to character arrays and sort them
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    // Compare sorted character arrays
    return Arrays.equals(charArray1, charArray2);
}
```

---

### 7. Check if Substring Exists

- Write a function to check if a given substring exists in a string.

```java
```

---

### 8. Longest Palindromic Substring

- Find the longest palindromic substring in a given string.

```java
```

---

### 9. String Compression

- Implement string compression using the counts of repeated characters (e.g., "aaabb" becomes "a3b2").

```java
```

---

### 10. Convert Roman to Integer

- Write a program to convert a Roman numeral string to an integer.

```java
public static int romanToInt(String roman) {
    int total = 0;
    int previousValue = 0;
    
    // Define a map for Roman numeral values
    int[] romanValues = new int[256]; // Array to store values for characters
    romanValues['I'] = 1;
    romanValues['V'] = 5;
    romanValues['X'] = 10;
    romanValues['L'] = 50;
    romanValues['C'] = 100;
    romanValues['D'] = 500;
    romanValues['M'] = 1000;

    // Iterate through the Roman numeral string from right to left
    for (int i = roman.length() - 1; i >= 0; i--) {
        char currentChar = roman.charAt(i);
        int currentValue = romanValues[currentChar];
        
        // If the current value is less than the previous value, subtract it
        if (currentValue < previousValue) {
            total -= currentValue;
        } else {
            total += currentValue; // Otherwise, add it
        }
        
        previousValue = currentValue; // Update previous value
    }
    
    return total; // Return the total integer value
}
```

---

### 11. Longest Common Prefix

- Find the longest common prefix from an array of strings.

```java
```

---

### 12. Check for Balanced Parentheses

- Write a function to check whether parentheses in a string are balanced.

```java
import java.util.Stack;

public static boolean areParenthesesBalanced(String str) {
    // Stack to keep track of opening parentheses
    Stack<Character> stack = new Stack<>();

    // Iterate through each character in the string
    for (char c : str.toCharArray()) {
        // If it's an opening bracket, push it onto the stack
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        }
        // If it's a closing bracket, check for matching opening bracket
        else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) {
                return false; // Unbalanced if stack is empty
            }
            char top = stack.pop(); // Get the top element from the stack
            // Check for matching parentheses
            if ((c == ')' && top != '(') || 
                (c == '}' && top != '{') || 
                (c == ']' && top != '[')) {
                return false; // Unbalanced
            }
        }
    }

    // The stack should be empty if all parentheses are balanced
    return stack.isEmpty();
}
```

---

### 13. Count Words in a String

- Write a program to count the number of words in a string.

```java
```

---

### 14. Permutations of a String

- Write a program to print all permutations of a string.

```java
```

---

### 15. Check if Strings are Rotation of Each Other

- Write a program to check if one string is a rotation of another.

```java
```

---

### 16. Convert String to Integer (atoi)

- Implement the atoi function to convert a string to an integer.

```java
```

---

### 17. Find the Longest Substring Without Repeating Characters

- Write a program to find the length of the longest substring without repeating characters.

```java
public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0; // To store the maximum length found
    int start = 0; // Start index of the current substring
    int[] charIndexMap = new int[256]; // Array to store the last index of each character

    // Initialize the character index array to -1
    for (int i = 0; i < charIndexMap.length; i++) {
        charIndexMap[i] = -1;
    }

    // Iterate through the string
    for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);
        
        // If the character was seen before and its last index is greater than or equal to the start index
        if (charIndexMap[currentChar] >= start) {
            start = charIndexMap[currentChar] + 1; // Update the start index
        }
        
        charIndexMap[currentChar] = i; // Update the last seen index of the character
        maxLength = Math.max(maxLength, i - start + 1); // Calculate the maximum length
    }

    return maxLength; // Return the maximum length found
}
```

---

### 18. Check if Two Strings are Isomorphic

- Write a function to check if two strings are isomorphic (each character in one string can map to exactly one character in an
other string).

```java
```

---

### 19. String Rotation (Cyclic Shift)

- Check if one string is a rotation of another string (e.g., "abcd" and "cdab").

```java
```

---

### 20. Valid Parentheses String

- Given a string containing just the characters (, ), {, }, [, ], determine if the input string is valid.

```java
```

---

## Coding Questions on Arrays

### 1. Find the Largest Element

- Write a program to find the largest element in an array.

```java
```

---

### 2. Reverse an Array

- Write a function to reverse an array in-place.

```java
```

---

### 3. Find the Second Largest Element

- Write a program to find the second largest element in an array.

```java
```

---

### 4. Array Rotation

- Rotate an array by k positions to the right.

```java
```

---

### 5. Find the Missing Number

- In an array containing numbers from 1 to n with one number missing, find the missing number.

```java
```

---

### 6. Find Duplicates in an Array

- Write a program to find duplicate elements in an array.

```java
```

---

### 7. Merge Two Sorted Arrays

- Given two sorted arrays, merge them into a single sorted array.

```java
```

---

### 8. Find the Majority Element

- Find the element that appears more than half the time in an array.

```java
```

---

### 9. Subarray with Given Sum

- Find a subarray with a given sum in an array of non-negative integers.

```java
```

---

### 10. Move All Zeros to End

- Move all zeros in an array to the end without changing the order of non-zero elements.

```java
```

---

### 11. Sort an Array of 0s, 1s, and 2s

- Write a program to sort an array consisting of only 0s, 1s, and 2s (Dutch National Flag problem).

```java
```

---

### 12. Find the Intersection of Two Arrays

- Given two arrays, find their intersection.

```java
```

---

### 13. Kadane's Algorithm

- Write a program to find the maximum sum subarray (Kadane’s algorithm).

```java
```

---

### 14. Find Pairs with Given Sum

- Find all pairs in an array whose sum equals a given value.

```java
```

---

### 15. Stock Buy and Sell Problem

- Given an array representing the prices of a stock on different days, write a program to maximize profit by choosing the best day to buy and the best day to sell.

```java
```

---

### 1.6 Cyclically Rotate Array by One

- Write a program to cyclically rotate an array by one position.

```java
```

---

### 17. Check if Array is Sorted

- Write a function to check if an array is sorted in non-decreasing order.

```java
```

---

### 19. Find the Maximum Product of Two Integers

- Write a program to find the maximum product of two integers in an array.

```java
```

---

### 20. Find the Longest Consecutive Subsequence

- Given an unsorted array, find the length of the longest consecutive elements sequence.

```java
```

---

### 21. Find the Minimum Element in a Rotated Sorted Array

- Write a program to find the minimum element in a rotated sorted array.
- 
```java
```

---

