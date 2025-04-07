package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveDuplicate {
	public static void main(String args[]) {
		List<Integer> number = new ArrayList<>();
		number.add(20);
		number.add(30);
		number.add(20);
 		number.add(40);
		number.add(30);
		number.add(10);
		number.add(0, 60);

		System.out.println("ArrayList With Duplicate Values " + number);
		List<Integer> result = new ArrayList<>();
		for (int i : number) {
			if (!result.contains(i)) {
				result.add(i);
			}
		}
		System.out.println("ArrayList without Duplicate Values " + result);
	}
}
