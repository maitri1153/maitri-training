package array;

import java.util.Arrays;

public class CopyOfArray {
	public static void main(String[] args) {
		// Get the array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer array: " + Arrays.toString(intArr));

		System.out.println("\nNew Arrays by copyOf:\n");

		System.out.println("Integer array: " + Arrays.toString(Arrays.copyOf(intArr, 10)));
	}
}