package ltsfeatures;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(21);
		list.add(9);
		list.add(15);
		list.add(27);
		list.add(9);
		list.add(3);

		boolean value = list.stream().allMatch(x -> x % 3 == 0);
		System.out.println(value);

		boolean anymatch = list.stream().anyMatch(x -> x % 2 == 0);
		System.out.println(anymatch);

		Stream.Builder<String> builder = Stream.builder();
		Stream<String> stream = builder.add("ABC").add("DEF").add("GHI").build();
		// stream.forEach(System.out::println);

		List<String> list1 = stream.map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(list1);

		System.out.print("Concate   ");
		Stream<String> stream1 = Stream.of("Geeks", "for");
		Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks");
		Stream.concat(stream1, stream2).forEach(System.out::println);

		System.out.print("Count()    ");
		long count = list.stream().count();
		System.out.println(count);

		System.out.print("Distinct()    ");
		Stream<Integer> result = list.stream().distinct();
		result.forEach(System.out::println);

		System.out.println("Empty method  ");
		Stream<String> str = Stream.empty();
		str.forEach(System.out::println);

		System.out.print("Filter()    ");
		list.stream().filter(x -> x % 5 == 0).forEach(System.out::println);

		System.out.print("FindAny()    ");
		Optional<Integer> optional = list.stream().findAny();
		if (optional.isPresent())
			System.out.println(optional.get());
		else
			System.out.println("Empty");

		System.out.print("FindFirst()   ");
		Optional<Integer> object = list.stream().findFirst();
		if (object.isPresent())
			System.out.println(object.get());
		else
			System.out.print("Null ");

		System.out.print("Flatmap()  ");
		List<String> lists = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
		lists.stream().flatMap(str1 -> Stream.of(str1.charAt(1))).forEach(System.out::print);

		List<List<Integer>> listoflist = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8, 9));
		List<Integer> answer = listoflist.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(answer);

		Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);

		Stream.iterate(2.0, x -> x > 0.05, x -> x / 2).forEach(System.out::println);
		int var = list.stream().max(Integer::compare).get();
		System.out.println("Max  " + var);

		int min = list.stream().min(Integer::compare).get();
		System.out.println("Min  " + min);

		boolean none = list.stream().noneMatch(x -> x > 27);
		System.out.println("NoneMatch : 27 " + none);

	}
}
