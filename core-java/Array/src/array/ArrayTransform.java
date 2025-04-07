package array;

import java.util.*;

public class ArrayTransform {

	public void print(int[][] array) {
		for (int[] row : array) {
			for (int x : row) {
				System.out.print(x + " ");
			}
			System.out.println(" ");
		}
	}

	public int[][] transform(int[][] array) {
		int[][] trasform = new int[5][5];
		for (int i = 0; i < array.length; i++) {
			int k = array.length - 1;
			for (int j = 0; j < array.length; j++) {
				trasform[k][i] = array[i][j];
				k--;
			}
		}
		return trasform;
	}

	public static void main(String args[]) {
		ArrayTransform arraytransform = new ArrayTransform();

		int array[][] = { { 1, 2, 3, 9, 4 }, { 4, 5, 6, 1, 7 }, { 7, 8, 9, 3, 2 }, { 8, 7, 5, 4, 2 },
				{ 1, 6, 4, 7, 9 } };
		System.out.println("Original array : ");
		arraytransform.print(array);

		System.out.println(
				"How many degree You want to transform from left side " + "(1->90,   2->180,   3->270,   4->360)");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int[][] arr = new int[5][5];
		for (int i = 1; i <= number; i++) {
			arr = arraytransform.transform(array);
			array = arr;
		}
		System.out.println("array after tranform : ");
		arraytransform.print(arr);

	}

}
