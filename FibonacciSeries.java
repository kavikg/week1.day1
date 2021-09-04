package week1.day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		int firstNum = 0, secNum = 1, sum;
		System.out.println("firstNum is " + firstNum);
		for (firstNum = 0; firstNum <= 8; firstNum++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println("sum is " + sum);

		}
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		// Print first number

		// Iterate from 1 to the range

		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number

		// print sum

	}

}
