package Q1;

public interface X {
	
	abstract void method_X_1();
	default void method_X_2() {}
	
	static void method_X_3() 
	{System.out.println("inside method_X_3 of X");}
	
}


 interface Y {
	
	abstract void method_Y_1();
	default void method_Y_2()
	{System.out.println("inside method_Y_2 of Y");}
	
	static void method_Y_3() 
	{System.out.println("inside method_Y_3 of Y");}
	
}

 interface Z extends X,Y{
	
	abstract void method_Z_1();
	
	
}
 
 
 class ZImpl implements Z{

	@Override
	public void method_X_2() {
		// TODO Auto-generated method stub
		Z.super.method_X_2();
		System.out.println("inside method_X_2 of ZImpl");
	}

	@Override
	public void method_Y_1() {
		// TODO Auto-generated method stub
		System.out.println("inside method_Y_1 of ZImpl");
		
	}

	@Override
	public void method_X_1() {
		// TODO Auto-generated method stub
		System.out.println("inside method_X_1 of ZImpl");
		
	}

	@Override
	public void method_Z_1() {
		// TODO Auto-generated method stub
		System.out.println("inside method_Z_1 of ZImpl");
	}
	
	 
 }
 
 
 
 
 
 class Demo  {
	 public static void main(String[] args) {
		ZImpl obj = new ZImpl();
		
		

		obj.method_X_1(); // abstract method overridden
		obj.method_X_2(); // default method overridden 
		X.method_X_3();   // static method, called by the interface name
		

		
		
		
		obj.method_Y_1(); // abstract method overridden
		obj.method_Y_2(); // default method not overridden 
		Y.method_Y_3();   // static method, called by the interface name
		
		
		obj.method_Z_1(); // abstract method overridden
		
	}
 }
 
 
 
 // abstract, default nad static methods in interface. Interface extending several interfaces.
 // class extending a class and various interfaces. Calling interface static method
 
 
 
