package exceptionhandling;

public class ThrowException {

	public static void main(String[] args) {
		try {
			int a = 100, b = 10;
			if (b == 0) {
				throwException();
			} else {
				int num = a / b;
				System.out.println(num);
			}
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

	static void throwException() {
		throw new RuntimeException("Something went wrong");
	}
}
