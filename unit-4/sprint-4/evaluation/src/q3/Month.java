package q3;

import java.util.Scanner;

public enum Month {

	JAN
	{
		@Override
		public void display() {
			System.out.println("This is the 1st Month of the Year January");
		}
	},
	FEB
	{
		@Override
		public void display() {
			System.out.println("This is the 2nd Month of the Year February");
		}
	},
	MAR
	{
		@Override
		public void display() {
			System.out.println("This is the 3rd Month of the Year March");
		}
	},
	APR
	{
		@Override
		public void display() {
			System.out.println("This is the 4th Month of the Year April");
		}
	},
	MAY
	{
		@Override
		public void display() {
			System.out.println("This is the 5th Month of the Year May");
		}
	},
	JUN
	{
		@Override
		public void display() {
			System.out.println("This is the 6th Month of the Year June");
		}
	},
	JUL
	{
		@Override
		public void display() {
			System.out.println("This is the 7th Month of the Year July");
		}
	},
	AUG
	{
		@Override
		public void display() {
			System.out.println("This is the 8th Month of the Year August");
		}
	},
	SEP
	{
		@Override
		public void display() {
			System.out.println("This is the 9th Month of the Year September");
		}
	},
	OCT
	{
		@Override
		public void display() {
			System.out.println("This is the 10th Month of the Year October");
		}
	},
	NOV
	{
		@Override
		public void display() {
			System.out.println("This is the 11th Month of the Year November");
		}
	},
	DEC
	{
		@Override
		public void display() {
			System.out.println("This is the 12th Month of the Year December");
		}
	};
	
	
	
	
	
	public void display() {
		
	}
	
}


class Demo{
	public void showDetails(String m) {
		switch (m) {
		case "JAN": {
			Month.JAN.display();break;
		}
		case "FEB": {
			Month.FEB.display();break;
		}
		case "MAR": {
			Month.MAR.display();break;
		}
		case "APR": {
			Month.APR.display();break;
		}
		case "MAY": {
			Month.MAY.display();break;
		}
		case "JUN": {
			Month.JUN.display();break;
		}
		case "JUL": {
			Month.JUL.display();break;
		}
		case "AUG": {
			Month.AUG.display();break;
		}
		case "SEP": {
			Month.SEP.display();break;
		}
		case "OCT": {
			Month.OCT.display();break;
		}
		case "NOV": {
			Month.NOV.display();break;
		}
		case "DEC": {
			Month.DEC.display();break;
		}
		
		default:
			System.out.println("Invalid Month Name : " + m);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("enter month ( in this format JAN,FEB...) : ");
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		
		Demo demo=new Demo();
		demo.showDetails(s);
	}
	
	
}







