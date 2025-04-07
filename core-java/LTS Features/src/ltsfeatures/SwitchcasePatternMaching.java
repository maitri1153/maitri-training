package ltsfeatures;

public class SwitchcasePatternMaching {
	public static void main(String[] args) {
		Object obj = "abc";
		String num = switch (obj) {
		case Integer i -> "Integer";
		case String s -> "String";
		default -> "It is not known data type.";
		};
		System.out.println(num);
	}
}
