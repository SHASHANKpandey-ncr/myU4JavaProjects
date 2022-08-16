package q1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//*****************************************************************************************

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message);
	}

	public InvalidAgeException() {

	}

}

//*****************************************************************************************

class EmployeeBonus {

	public double knowBonus() throws InvalidAgeException {

		double a;

		try {
			System.out.println("Enter  joining date  in dd-MM-yyyy format : ");

			Scanner sc = new Scanner(System.in);

			String doj = sc.next();

			LocalDate d1 = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

			LocalDate c1 = LocalDate.now();

			Period p = Period.between(d1, c1);

			if (p.getYears() < 1 && p.getYears() >= 0)
				a = 5000;

			else if (p.getYears() < 2 && p.getYears() >= 1)
				a = 8000;

			else if (p.getYears() >= 2)
				a = 10000;

			else
				throw new InvalidAgeException("Age should not be in the future");
		} catch (InvalidAgeException e1) {
			System.out.println(e1);
			return 0;
		} catch (DateTimeParseException nfe) {

			InvalidAgeException iae = new InvalidAgeException("Please pass the date in the correct format");

			throw iae;
		}
		return a;

	}

}

//*****************************************************************************************

class Main {
	public static void main(String[] args) {

		EmployeeBonus e = new EmployeeBonus();

		try {

			double bonus = e.knowBonus();
			if (bonus != 0)
				System.out.println("Your Bonus is : " + bonus);
		} catch (InvalidAgeException e1) {
			System.out.println(e1);
		}

		System.out.println();
		System.out.println("Thankyou !!");
	}

}


// comparing period between current and entered date
// get work period of employee and cal bonus
// Exception rethrowing: using single user defined exception for different exceptions
// checked user defined exception
// date and time api
// date formatting and checking date format 
