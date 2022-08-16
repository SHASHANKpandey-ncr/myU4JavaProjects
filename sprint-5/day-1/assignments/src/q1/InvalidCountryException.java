package q1;

import java.util.Scanner;

public class InvalidCountryException extends Exception {

	public InvalidCountryException(String message) {
		super(message);
	}

	public InvalidCountryException() {

	}

}

class UserRegistration {
	public static void registerUser(String username, String userCountry) throws InvalidCountryException {

		if (userCountry.contains("India")) {

			System.out.println("User registration done successfully");

		} else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter name : ");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();

		System.out.println("Enter country : ");
		Scanner input1 = new Scanner(System.in);
		String s2 = input1.nextLine();

		try {
			registerUser(s1, s2);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
}
