package Q2;

// Create an enum Stadium with the following names-

import java.util.Scanner;

public enum Stadium {

	EDEN_GARDENS_STADIUM{@Override
	public void display() {
		System.out.println("This is the home ground of KKR");
		super.display();
	}},
	
	WANKHEDE_STADIUM{@Override
	public void display() {
		System.out.println("This is the home ground of Mumbai Indians");
		super.display();
	}},
	
	CHIDAMBARAM_STADIUM{@Override
	public void display() {
		System.out.println("This is the home ground of CSK");
		super.display();
	}},
	
	M_CHINNASWAMY_STADIUM{@Override
	public void display() {
		System.out.println("This is the home ground of RCB");
		super.display();
	}};
	
	public void display() {
		
	}

}


class IPL{
	public static void homeTeamStadium(String stadium) {
		
		switch (stadium) {
		
		case "EDEN_GARDENS_STADIUM": 
		{Stadium.EDEN_GARDENS_STADIUM.display();}break;
		
		case "WANKHEDE_STADIUM":
		{Stadium.WANKHEDE_STADIUM.display();}break;
		
		case "CHIDAMBARAM_STADIUM": 
		{Stadium.CHIDAMBARAM_STADIUM.display();}break;
		
		case "M_CHINNASWAMY_STADIUM": 
		{Stadium.M_CHINNASWAMY_STADIUM.display();}break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + stadium);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the stadium name : ");
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		
			homeTeamStadium(s);  
			
		
	}
}










