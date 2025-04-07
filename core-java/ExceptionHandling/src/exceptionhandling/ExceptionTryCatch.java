package exceptionhandling;

public class ExceptionTryCatch {
	public static float divide(int a, int b) throws ArithmeticException {
		float answer = a / b;
		return answer;
	}

	public static void main(String args[]) {
		try {
			int a = 100, b = 0;
			float answer = divide(a, b);
			System.out.println(answer);
		}

		catch (ArithmeticException e) {
			System.out.println("Number can't Divide by zero !!!!");
		}
	}
}
