package Q2;

import java.lang.reflect.Array;
import java.util.Scanner;

public interface Hotel {

	void chickenBiryani();
	void masalaDosa();
	void welcomeDrink();
	
} 

class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("chicken Biryani from the TajHotel");
		
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("masala Dosa from the TajHotel");
		
	}
	
	@Override
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}
	
	// specific method
	public void welcomeSoup(){
		System.out.println("Welcome Soup from the TajHotel");
	}
	
	
	
}


class RoadSideHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("chicken Biryani from the RoadSideHotel");
		
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("masala Dosa from the RoadSideHotel");
		
	}
	
	@Override
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the RoadSideHotel");
	}
	
	
	
}



class Demo{
	
	public Hotel provideFood(int amount) {

		if(amount>=1000) {return new TajHotel();}
		else if 
		(amount<1000&&amount>=200) {return new RoadSideHotel();}
		else 
		{System.out.println("Please Enter a valid amount !! ");return null;}
	}
	
	public static void main(String[] args) {
		 Demo obj=new Demo();
			System.out.println("Please enter amount : ");
			Scanner input=new Scanner(System.in); 
			int amount=input.nextInt();

			
			if(obj.provideFood(amount)!=null) {
				if(obj.provideFood(amount) instanceof  TajHotel) {
					new TajHotel().welcomeSoup(); // calling specific method of TajHotel
				}
				 obj.provideFood(amount).welcomeDrink();
				 obj.provideFood(amount).chickenBiryani();
				 obj.provideFood(amount).masalaDosa();
			}
			
			
			
//			
			

	}
	
}







