package q2;

//  input validations inside validate() method

import java.util.Scanner;
import java.util.regex.Pattern;

public class Citizen {

	
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	private String aadharNumber;
	private String mobileNumber;

}


class Demo{
	
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(!Pattern.matches("[a-zA-Z]{3,8}", name)) 
		{System.out.println("Please enter correct name !! ");return false;}
		
		if(!Pattern.matches("[6789]{1}[0-9]{9}", mobileNum)) 
		{System.out.println("Please enter correct mobile Num !! ");return false;}
		
		if(!Pattern.matches("[0-9]{12}", aadharCard)) 
		{System.out.println("Please enter correct Aadhar Num !! ");return false;}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println("enetr name : ");
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		
		System.out.println("enetr mobile Num : ");
		String mobileNum=input.nextLine();
		
		System.out.println("enetr aadhar Card No. : ");
		String aadharCard=input.nextLine();
		
		Demo demo=new Demo();
		if(demo.validate(name, mobileNum, aadharCard)) {
			Citizen citizen=new Citizen();
			citizen.setMobileNumber(mobileNum);
			citizen.setAadharNumber(aadharCard);
			System.out.println();
			System.out.println("name : "+ name);
			System.out.println("Mobile Number : "+ citizen.getMobileNumber());
			System.out.println("Aadhar Number : "+ citizen.getAadharNumber());
		}
	}
}








// validating
//Pattern.matches("[a-zA-Z]{3,8}", "Shashank"); name - len 3to8 only alphabets
//Pattern.matches("[0-9]{12}", "123456789102"); aadarNo - len 12 only digits
//Pattern.matches("[6789]{1}[0-9]{9}", "0953038949"); mobNo - len 10 startWith6789 
