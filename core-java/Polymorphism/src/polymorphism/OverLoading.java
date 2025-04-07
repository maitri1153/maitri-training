package polymorphism;

public class OverLoading {
	public static void main(String args[]) {
		OverLoading overloading = new OverLoading();
		overloading.sum(10, 20);
		overloading.sum(10.2, 11.4);
		overloading.sum(11.3, 45);
	}

	void sum(int a, int b) {
		System.out.println("Sum is : " + (a + b));
	}

	void sum(double a, double b) {
		System.out.println("sum is : " + (a + b));
	}

	void sum(double a, int b) {
		System.out.println("sum is : " + (a + b));
	}
}
