package collection;

import java.util.*;

public class ArrayListMethods {

	public static void main(String args[]) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(0, 0);
		array.add(40);
		System.out.println("Original List Array" + array);

		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(array);
		System.out.println("After addAll Method" + list);

		list.addAll(3, array);
		System.out.println("After addAll with index Method" + list);

		list.clear();
		System.out.println("After clear Method" + list);

		array.ensureCapacity(20);
		System.out.println("Get method " + array.get(0));
		System.out.println("IsEmpty method :" + array.isEmpty());

		System.out.println("Iterator");
		Iterator<Integer> iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		System.out.println("ListIterator it can traverse both ways");
		ListIterator<Integer> iterator1 = array.listIterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next() + " ");

		}
		System.out.println("With previous value : " + iterator1.previous());

		System.out.println("LastIndex of  method :" + array.lastIndexOf(array));

		Object[] toarr = array.toArray();
		System.out.println("toArray method :" + Arrays.toString(toarr));

		ArrayList<Integer> arrayclone = new ArrayList<>();
		arrayclone = (ArrayList<Integer>) array.clone();
		System.out.println("Clone method " + arrayclone);

		System.out.println("Contains method " + array.contains(20));

		System.out.println("Index of Method : " + array.indexOf(20));

		array.remove(2);
		System.out.println("After remove(2) " + array);

		array.removeIf(n -> (n % 3 == 0));
		System.out.println("After removeIf " + array);

		array.add(40);
		array.add(20);
		array.add(80);
		System.out.println("Add few elements : " + array);

		array.set(2, 90);
		System.out.println("After set(0,90) " + array);

		array.sort(null);
		System.out.println("After Sorting " + array);

		System.out.println("SubList of array " + array.subList(0, 2));

		System.out.println("Size () " + array.size());

		System.out.println("Spliterator : ");
		Spliterator<Integer> spliterator = array.spliterator();
		spliterator.forEachRemaining(System.out::println);

		array.trimToSize();

	}

}
