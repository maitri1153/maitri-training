package ltsfeatures;

@FunctionalInterface
interface StringOper {
	String concat(String left, String right);
}

@FunctionalInterface
interface IntegerOper {
	Integer sum(int a, int b);
}

public class VarKeyword {
	public static void main(String args[]) {
		StringOper stringoper = (var left, var right) -> left + right;
		String op = stringoper.concat("hello", " world!!");
		System.out.println(op);

		IntegerOper i = (var left, var right) -> left + right;
		Integer ig = i.sum(10, 11);
		System.out.println(ig);
	}
}
