package q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {


		System.out.println("start of main..");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = Integer.parseInt(sc.nextLine()) ;
		
		System.out.println("Enter num2");
		int num2 = Integer.parseInt(sc.nextLine()) ;
		
		String message=null;
		
		int num3 = num1 / num2;
		if (num3 > 10) {
			message = "Welcome to Exception Handling ";
		}
		System.out.println("Message is :" + message.toUpperCase());
		

	}
		catch(NumberFormatException nfe)
			{
				System.out.println("Please enter valid number");
			}
		catch(ArithmeticException ae)
			{
				System.out.println("num2 should not be 0");
			}
		catch(NullPointerException npe)
			{
				System.out.println("String value is null");
			}
		catch(Exception e)
			{
			System.out.println("WELCOME TO EXCEPTION HANDLING");
			}
		System.out.println("end of main");
}

}
