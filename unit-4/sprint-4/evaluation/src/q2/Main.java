package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println("Enter the number of elements in the array : ");
			Scanner input=new Scanner(System.in);
			int s=input.nextInt();
			
			int[] arr=new int[s];
			System.out.println("Enter the elements in the array : ");
			for(int i=0;i<arr.length;i++) {
				
				Scanner input1=new Scanner(System.in);
				int s1=input1.nextInt();
				arr[i]=s1;
			}
			
			System.out.println("Enter the index of the array element you want to access : ");
			Scanner input2=new Scanner(System.in);
			int s2=input2.nextInt();
			
			System.out.println("The array element at index "+s2+" = "+arr[s2]);
			System.out.println("The array element successfully accessed");
		} catch (NumberFormatException nfe) {
			System.out.println(nfe);
		} catch (ArrayIndexOutOfBoundsException aiob) {
				System.out.println(aiob);
			}
		
	}
	
}
