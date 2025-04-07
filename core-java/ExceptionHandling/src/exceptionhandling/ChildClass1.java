package exceptionhandling;

public class ChildClass1 {
	public int result() {
		ChildClass2 childclass = new ChildClass2();
		int[] number = childclass.getNumber();

		int a = number[0];
		int b = number[1];
		if ((b == 0) || (a == 0)) {
			throw new ArithmeticException();
		}
		return (a / b);
	}
}
