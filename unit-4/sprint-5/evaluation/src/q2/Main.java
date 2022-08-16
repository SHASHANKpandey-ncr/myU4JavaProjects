package q2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter DOB in dd-MM-yyyy format : ");
		String dob=sc.next();
		
		
		try {
			
			LocalDate d=LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			
			LocalDate c=LocalDate.now();
			
			Period p=Period.between(d,c);
			
			
			 if(d.getDayOfMonth()==c.getDayOfMonth()&&d.getMonth()==c.getMonth()&&p.getYears()>=18) 
			{
				System.out.println("Happy Birthday,You are eligible to cast your vote");
			}
			
			else if(p.getYears()>=18) 
			{
				System.out.println("You are eligible to cast your vote");
			}
			else if(d.getDayOfMonth()==c.getDayOfMonth()&&d.getMonth()==c.getMonth()&&p.getYears()>=0&&p.getYears()<18) 
			{
				System.out.println("Happy Birthday, Sorry, You are not eligible to cast your vote");
			}
			else if(p.getYears()>=0&&p.getYears()<18) 
			{
				System.out.println("Sorry, You are not eligible to cast your vote");
			}
			else if(p.getYears()<0)
			{
				System.out.println("Date of birth should not be in future");
			}
			
			
			
			
		} catch (DateTimeParseException e) {
			System.out.println("please pass the date in the proper format");
		}
		
	}
	
}
