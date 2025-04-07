package collection;

import java.util.*;

public class HashMapMethod {
	public static void main(String args[]) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "One");
		map1.put(2, "Two");
		map1.put(3, "Three");
		map1.putIfAbsent(8, "Eight");
		System.out.println("Key Values of Map are : " + (map1.keySet()));
		System.out.println("Values of Map are : " + map1.values());

		map1.compute(1, (key, value) -> value.concat("s"));
		String i = map1.putIfAbsent(10, "Ten");

		HashMap<Integer, String> map = new HashMap<>(map1);
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(2, "two");
		map.remove(2);
		System.out.println(map);
		System.out.println("Set of map is : " + map.entrySet());

		map.merge(3, "Three", (a, b) -> a + "-> " + b);
		map.replaceAll((k, v) -> k + " is " + v);
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.print("Key    : " + e.getKey());
			System.out.println(" Value : " + e.getValue());
		}
		System.out.println(map1.getOrDefault(30, "Not Present"));

	}
}
