package object;

import java.util.Scanner;

public class FindTheMissingNumber {
	int num;
	int sumOfNumbers;
	int missingNumber;

	public FindTheMissingNumber(int num) {
		sumOfNumbers = (num * (num + 1)) / 2;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		int[] array = new int[num - 1];
		for (int i = 0; i < num - 1; i++) {
			System.out.println("enter the number" + i);
			int values = scan.nextInt();
			array[i] = values;
		}
		if (sum != sumOfNumbers) {
			missingNumber = sumOfNumbers - sum;
		}
	}

	public static void main(String[] args) {
		FindTheMissingNumber number = new FindTheMissingNumber(10);
		System.out.println(number.missingNumber);

	}

}
