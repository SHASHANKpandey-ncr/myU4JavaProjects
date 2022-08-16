package q3;

import java.util.Scanner;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String message) {
		super(message);
	}

	public InsufficientFundsException() {

	}

}

class Account {
	double acount_number;
	double acount_balance;

	public Account(double acount_number) {
		// TODO Auto-generated constructor stub
		this.acount_number = acount_number;
	}

	public void deposit(double amount) {
		acount_balance = acount_balance + amount;
	}

	public double withdraw(double amount) throws InsufficientFundsException {
		if (amount <= acount_balance) {
			acount_balance = acount_balance - amount;
			return (Double) acount_balance;
		} else {
			InsufficientFundsException ife = new InsufficientFundsException("Insufficient balance !!");
			throw ife;
		}
// 
	}
}

class AccountDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Enter acount_number : ");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			Account account1 = new Account(a);

			System.out.println(" current balance : " + account1.acount_balance);
			System.out.println(
					"Enter the amount you want to deposite " + "(enter 0 if you don't want to deposite anything) : ");
			Scanner input2 = new Scanner(System.in);
			int b = input2.nextInt();
			account1.deposit(b);
			System.out.println("updated current balance : " + account1.acount_balance);

			System.out.println(
					"Enter the amount you want to withdraw " + "(enter 0 if you don't want to withdraw anything) : ");
			Scanner input3 = new Scanner(System.in);
			int c = input3.nextInt();

			account1.withdraw(c);
			System.out.println("updated current balance : " + account1.acount_balance);
		} catch (InsufficientFundsException ife) {
			System.out.println(ife);
		} catch (Exception e) {
			System.out.println("Plaese eneter correct details !! ");
		}

		System.out.println("Thankyou for banking with us !!");

	}

}
