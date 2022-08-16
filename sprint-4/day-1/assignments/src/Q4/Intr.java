package Q4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//*****************************************************

public interface Intr {
	
		int[] display(int p);
}

//*****************************************************

class Test implements Intr{
	
	
	
	public boolean checkPrime(int n) {
		int fact=0;
		boolean prime=false;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {fact++;}
		}
		if(fact==2) {prime=true;}
		return prime;
	}

	@Override
	
	public int[] display(int p){
		
		Stack stk=new Stack<>();
		
		for(int i=1;i<=p;i++) {
			if(checkPrime(i)) {
				stk.push(i);
			}
		}
		int[] a=new int[stk.size()];
		
		for(int j=0;j<stk.size();j++) {
			a[j]=(Integer) stk.get(j);
		}
		
		return a;
		
	}

	
	
	
}

//*****************************************************

class Main5{

	public static void main(String[] args) {
	Test t=new Test();
	System.out.println("Enter the number : ");
	Scanner input = new Scanner(System.in);
	int x=input.nextInt();
	
	int[] arr= t.display(x);
	String str="";
	for(int i=0;i<arr.length;i++) {str+=arr[i]+" ";}
	
	System.out.println("The prime numbers upto "+x+" are : "+str);
	
	}
}




















