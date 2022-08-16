package q3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter start date in dd-MM-yyyy format");
			String start = sc.next();
			System.out.println("Enter end date in dd-MM-yyyy format");
			String end = sc.next();

			LocalDate d1 = LocalDate.parse(start, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			int dy = d1.getYear();
			int dm = d1.getMonthValue();
			int dd = d1.getDayOfMonth();

			LocalDateTime startDate = LocalDateTime.of(dy, dm, dd, 0, 0);

			// 20-07-2022

			LocalDate c1 = LocalDate.parse(end, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			int cy = c1.getYear();
			int cm = c1.getMonthValue();
			int cd = c1.getDayOfMonth();

			LocalDateTime endDate = LocalDateTime.of(cy, cm, cd, 0, 0);
//			LocalDateTime endDate = LocalDateTime.now(); use it for current date

			if (ChronoUnit.DAYS.between(startDate, endDate) >= 0) {
				{

					long x = ChronoUnit.DAYS.between(startDate, endDate);

					System.out.println("total wages : " + 1200 * x);
				}
			} else {

				System.out.println("Start date should be smaller than End date !!");
			}
		} catch (DateTimeParseException e) {
			System.out.println("Please enter date in dd-MM-yyyy” format");
		}

	}

}




// ChronoUnit use
//comparing period between start and end date using ChronoUnit
// use Period and Period.between for comparison of years only
//cal no. of days between two dates and cal wages
//checked user defined exception
//date and time api
//date formatting and checking date format 
