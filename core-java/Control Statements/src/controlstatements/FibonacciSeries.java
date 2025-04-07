package controlstatements;

public class FibonacciSeries {
	public static int a = 0, b = 1, c = 0;

	public static void printFibo(int count) {
		if (count > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
			printFibo(--count);
		}
	}

	public static void main(String args[]) {
		int number = 10;
		System.out.print(a + " " + b + " ");
		printFibo(number - 2);
	}
}
