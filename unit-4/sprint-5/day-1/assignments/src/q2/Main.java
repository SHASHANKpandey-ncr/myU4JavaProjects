package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {
		try {
			System.out.println("Program to find quotient of a/b ");
			System.out.println("Enter the value of a : ");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();

			System.out.println("Enter the value of b : ");
			Scanner input1 = new Scanner(System.in);
			int b = input1.nextInt();

			System.out.println("the quotient is : " + a / b);
		} catch (ArithmeticException ae) {
			System.out.println("DivideByZeroException caught !!");
		} catch (Exception e) {
			System.out.println("Please follow the instructions carefully !!");
		} finally {
			System.out.println("Inside finally block");
		}

	}

}
