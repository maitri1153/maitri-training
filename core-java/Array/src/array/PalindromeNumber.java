package array;

public class PalindromeNumber {

	public static void main(String args[]) {
		int number = 123454321;
		int copy = number;
		int result = 0;

		while (number > 0) {
			int remender = number % 10;
			result = result * 10 + remender;
			number = number / 10;
		}
		if (copy == result) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
