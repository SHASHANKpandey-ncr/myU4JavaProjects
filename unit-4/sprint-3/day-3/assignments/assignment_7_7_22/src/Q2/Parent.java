package Q2;

import java.util.Scanner;

public class Parent {


        void method1(){}

        final void method2(){System.out.println("inside method2 of Parent");}

        void method3(){System.out.println("inside method3 of Parent");}

        final int number;

//        public Parent(){}    no need of this because of line 25 & line 42


        public Parent(int num){
            this.number=num;
        }

}



final class Child extends Parent{


    public Child(int num) { // to fix line no. 16 
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
    void method1(){

        Parent obj=new Parent(number);


        if(obj.number<1||obj.number>10){
            System.out.println("Invalid number");
        }
        else {
            System.out.println(obj.number);
        }

    }

	
    public void method4(){System.out.println("inside method4 of Child");}

}



class Main{
    public static void main(String[] args) {
//        Child obj=new Child(0);

        System.out.println("Enter the number : ");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        Parent obj=new Child(x);
        obj.method1();
        obj.method2();
        obj.method3();
        
        Child a=(Child)obj;
        a.method4();

    }
}

