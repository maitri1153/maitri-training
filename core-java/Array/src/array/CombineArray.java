package array;

import java.util.Arrays;

public class CombineArray {
	public static void main(String args[]) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };
		int[] result = new int[array1.length + array2.length];
		int index = 0;
		int length = array1.length;

		for (int i = 0; i < length; i++) {
			result[index] = array1[i];
			index++;
			result[index] = array2[i];
			index++;
		}

		System.out.println("Result array is : " + Arrays.toString(result));
	}
}
