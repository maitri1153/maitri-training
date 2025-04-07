package exceptionhandling;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String string) {
		super(string);
		//System.out.print(System.currentTimeMillis());
	}
}

public class CustomException {
	public static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("\nYou are not valid user");
		} else {
			System.out.println("You are validate user");
		}
	}

	public static void main(String args[]) {
		try {
			int age = 12;
			validate(age);
		} catch (InvalidAgeException e) {
			System.out.println("Caught an Error : " + e);
		}
	}

}
