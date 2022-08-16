package Q1;

import java.util.Scanner;

public class Student {

    int rollNumber;
    String studentName;
    int marks;

    Student(){ // Zero-argument constructor
        rollNumber=12;
        studentName="sp";
        marks=99;
    }

    Student(int rollNumber,String studentName,int marks){ // parameterized constructor
        this.rollNumber=rollNumber;
        this.studentName=studentName;
        this.marks=marks;
    }

    public static void main(String[] args) {

        System.out.println("Enter Number of Students you want to enter");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();



        for(int i=0;i<n;i++){
            System.out.println("Enter the Roll Number : ");
            Scanner input1=new Scanner(System.in);
            int roll=input1.nextInt();

            System.out.println("Enter the Name : ");
            Scanner input2=new Scanner(System.in);
            String name=input2.nextLine();

            System.out.println("Enter the marks : ");
            Scanner input3=new Scanner(System.in);
            int mark=input3.nextInt();


            Student student=new Student(roll,name,mark);
            System.out.println();
            System.out.println("Student Detail "+(i+1)+":" );
            System.out.println("Student Roll Number : "+student.rollNumber);
            System.out.println("Student Roll Name : "+student.studentName);
            System.out.println("Student Roll marks : "+student.marks);
            System.out.println();

        }

    }

}
