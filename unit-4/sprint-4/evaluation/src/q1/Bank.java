package q1;

import java.util.Scanner;

public class Bank {

	String branchName;
	String ifscCode;
	
	public void displayDetails() {
		System.out.println("branch Name : "+branchName);
		System.out.println("ifsc Code : "+ifscCode);
	}
	
}

class AxisBank extends Bank{
	double rateOfInterest;
	@Override
	public void displayDetails() {
		System.out.println("branch Name : "+branchName);
		System.out.println("ifsc Code : "+ifscCode);
		System.out.println("rate Of Interest : "+rateOfInterest);
	}
	
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
	
}


class ICICIBank extends Bank{
	double rateOfInterest;
	@Override
	public void displayDetails() {
		System.out.println("branch Name : "+branchName);
		System.out.println("ifsc Code : "+ifscCode);
		System.out.println("rate Of Interest : "+rateOfInterest);
	}
}






class Demo{
	
	public static Bank getBank(String bank) {
		if(bank.equals("axis")) {return new AxisBank();}
		else if(bank.equals("icici")) {return new ICICIBank();}
		else return null;
	}
	
	
	public static void main(String[] args) {
		System.out.println("enter bank : ");
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		getBank(s);
		System.out.println();
		
		Bank b=getBank(s);
		if(b instanceof AxisBank) {
			AxisBank a=new AxisBank();
			System.out.println("enter branch Name : ");
			Scanner input1=new Scanner(System.in);
			String s1=input1.nextLine();
			b.branchName=s1;
			
			System.out.println("enter ifsc Code : ");
			Scanner input2=new Scanner(System.in);
			String s3=input2.nextLine();
			b.ifscCode=s3;
			
			System.out.println("enter rate Of Interest : ");
			Scanner input3=new Scanner(System.in);
			Double s4=input3.nextDouble();
			a.rateOfInterest=s4;
			
			System.out.println();
			b.displayDetails();
			a.getCreditCard();
			
		}
		
		
		else if(b instanceof ICICIBank) {
			ICICIBank i=new ICICIBank();
			System.out.println("enter branch Name : ");
			Scanner input1=new Scanner(System.in);
			String s1=input1.nextLine();
			b.branchName=s1;
			
			System.out.println("enter ifsc Code : ");
			Scanner input2=new Scanner(System.in);
			String s3=input2.nextLine();
			b.ifscCode=s3;
			
			System.out.println("enter rate Of Interest : ");
			Scanner input3=new Scanner(System.in);
			Double s4=input3.nextDouble();
			i.rateOfInterest=s4;
			
			System.out.println();
			b.displayDetails();
			
			
		}
	}
	
}


