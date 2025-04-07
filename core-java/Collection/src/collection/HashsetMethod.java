package collection;

import java.util.*;

public class HashsetMethod {
	public static void main(String args[]) {

		HashSet<Integer> list1 = new HashSet<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1);

		HashSet<Integer> list = new HashSet<>();
		list = (HashSet) list1.clone();
		System.out.println("After list1.clone() list HashSet " + list);

		list1.clear();
		System.out.println("After list1.remove() " + list1);

		System.out.println("IsEmpty() " + list.isEmpty());
		System.out.println("Contains(obj) method : " + list.contains(60));

		Iterator<Integer> iterator = list.iterator();
		System.out.println("Iterator :");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Remove(obj) " + list.remove(10));
		System.out.println(list);
		System.out.println("Size() " + list.size());
	}
}
