package collection;

import java.util.*;

public class LinkedListMethod {

	public static void main(String args[]) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		System.out.println("After add(e) " + list1);

		list1.add(0, "d");
		System.out.println("After add(index,e) " + list1);

		LinkedList<String> list = new LinkedList<>();
		list.addAll(list1);
		System.out.println("After addAll(c) " + list);

		list.addFirst("e");
		System.out.println("After addFirst(e) " + list);

		list.addLast("f");
		System.out.println("After addLast(e) " + list);

		list1.clear();
		System.out.println("After clear(list1)" + list1);

		list.offer("g");
		System.out.println("After offer(g) " + list);

		list.offerFirst("h");
		System.out.println("After offerFirst(h) " + list);

		list.offerLast("i");
		System.out.println("After offerLast(i) " + list);

		list.push("j");
		System.out.println("After push(j) " + list);

		System.out.println("Writes first element : " + list.element());

		// get,getFirst,getLast
		// indexof(obj)

		System.out.println("Peek() " + list.peek());
		System.out.println("PeekFirst() " + list.peekFirst());
		System.out.println("PeekLast() " + list.peekLast());

		System.out.println("Pop() " + list.pop());
		System.out.println("poll() " + list.poll());
		System.out.println("pollFirst() " + list.pollFirst());
		System.out.println("pollLast() " + list.pollLast());

		// remove,removeAt(index),remove(obj),removeFirstOccurence(obj),same for
		// last,removeFirst(),removeLast().
	}

}
