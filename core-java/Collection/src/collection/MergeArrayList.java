package collection;

import java.util.*;

public class MergeArrayList {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		List<Integer> list1 = new ArrayList<>();
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			result.add(list.get(i));
			result.add(list1.get(i));
		}

		System.out.println("ArrayList 1 are : " + list);
		System.out.println("ArrayList 2 are : " + list1);
		System.out.println("Combine ArrayList are : " + result);
	}
}
