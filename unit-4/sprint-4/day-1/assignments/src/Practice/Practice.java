package Practice;

public class Practice {

	
	public static void main(String[] args) {
		

	String s1=new String("sp");          // s1-  [45]
	String s2=new String("sp");          // s2-   [56]
	
	System.out.println(s1==s2); //false;  because of new key, word Java is creating
	// a brand new object in memory location and the variable s1 and s2 are pointing to
	// that memory location. so this == are comparing the memory locations not the content.
	
	
	int n1=5;
	int n2=5;
	System.out.println(n1==n2); // true; because primitive data types reference variables in java represents 
	// to original values and not the memory locations. 
	
	//but non primitive data types reference variables in java represents to memory 
	// location of the object and not the original value. 
	
	//1. use == for primitives
	
	
	
	
	System.out.println(s1.equals(s2)); //true; Checking every character
	//2. use .equals() for non primitives
	
	
	
	
	String s3="np";        
	String s4="np";
	System.out.println(s3==s4); //true; because if we use string literals and if the 
	//assigned values are equal Java will give them the same memory location.
	
	
	
}
}
