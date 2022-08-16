package q4;

import java.util.Scanner;

// Handle exception in number Problem statement:

public class Main {

	public static void main(String[] args) {

		try {

			System.out.println("Enter the Number : ");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			int num = Integer.parseInt(str);
			System.out.println("Square of the number is : " + num*num);
			System.out.println("The work has been done successfully");
		}

		catch (NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer");
//			System.out.println(nfe.getMessage());
//			System.out.println(nfe);
		}
//			System.out.println("done");
	}

}
