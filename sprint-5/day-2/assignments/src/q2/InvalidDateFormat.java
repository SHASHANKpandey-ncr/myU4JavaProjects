package q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InvalidDateFormat extends Exception {

	public InvalidDateFormat(String message) {
		super(message);
	}

	public InvalidDateFormat() {

	}

}

class Main {
	public static void knowAge() throws InvalidDateFormat {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your date of birth in dd-MM-yyyy format");
		String dob = sc.next();
		try {
			LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate c1 = LocalDate.now();
			Period p = Period.between(d1, c1);
			if (p.getYears() >= 0) {
				System.out.println("Your age is : " + p.getYears());
			} else {
				System.out.println("Date should not be in Future !! ");
			}
		} catch (DateTimeParseException e) {
			throw new InvalidDateFormat("Please enter Valid Date Format !!");
		}
	}
	
		public static void main(String[] args) {
			try {
				Main.knowAge();
			} catch (InvalidDateFormat e) {
				System.out.println(e);
			}
		}
}



//comparing period between current and entered date
//cal age of user by taking dob
//Exception rethrowing: using single user defined exception for different exceptions
//checked user defined exception
//date and time api
//date formatting and checking date format 





