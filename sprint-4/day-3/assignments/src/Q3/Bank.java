package Q3;

public class Bank {

	private Bank() {
		System.out.println("Inside private constructor of Bank");
	}

	public static Bank getObject() { // factory method
		return new Bank();
	}

	void funBank() {

	}

}

class Main {

	public static void main(String[] args) {

		// Create an object of bank here

//			Bank bank=new Bank(); // not possible 

		Bank bank = Bank.getObject();
		bank.funBank(); // op- Inside private constructor of Bank

	}

}
