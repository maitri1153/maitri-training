package array;

import java.util.Arrays;

public class RemoveDuplicate {

	public void removeDuplicate(int array1[]) {
		int length = array1.length;
		int[] result = new int[10];
		int j = 0;

		for (int i = 0; i < length - 1; i++) {
			if (array1[i] != array1[i + 1]) {
				result[j++] = array1[i];
			}
		}
		result[j++] = array1[length - 1];

		System.out.println("array after removing duplicate values : " + Arrays.toString(result));

		/*
		 * Set<Integer> set = new HashSet<>(); for(int i=0;i<array1.length;i++) {
		 * set.add(array1[i]); }
		 */

		/*
		 * int[] result = new int[5]; int k=0,flag=1; for(int i=0;i<array1.length;i++){
		 * for(int j=0;j<result.length;j++){ if(result[j]==array1[i]){ flag=0; break; }
		 * else flag=1; } if(flag==1){ result[k] = array1[i]; k++; } }
		 */

		// System.out.println("Original array without Duplicate Values : "+ set);
	}

	public static void main(String args[]) {
		int array1[] = { 1, 1, 1, 0, 0, 0, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5 };
		RemoveDuplicate removeduplicate = new RemoveDuplicate();
		System.out.println("Original array with Duplicate Values : " + Arrays.toString(array1));
		removeduplicate.removeDuplicate(array1);
	}
}
