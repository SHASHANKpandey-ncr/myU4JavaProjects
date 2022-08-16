package Q1;

import java.util.Scanner;

public abstract class Student {

    String name;
    String address;

    public abstract int getPercentage();

}

class ScienceStudent extends Student{

    int phisicsMarks;
    int chemistryMarks;
    int mathsMarks;


    @Override
    public int getPercentage() {
        return (phisicsMarks+chemistryMarks+mathsMarks)/3;
    }


}

class HistoryStudent extends Student{

    int historyMarks;
    int civicsMarks;



    @Override
    public int getPercentage() {
        return (historyMarks+civicsMarks)/2;
    }


}

class AllStudents{

    public static void main(String[] args) {

    ScienceStudent student1=new ScienceStudent();

        System.out.println("Enter details of science student  ");
        System.out.println("Enter student's name : ");
        Scanner input1=new Scanner(System.in);
        student1.name=input1.nextLine();

        System.out.println("Enter student's address : ");
        Scanner input2=new Scanner(System.in);
        student1.address=input2.nextLine();

        System.out.println("Enter student's phisics Marks : ");
        Scanner input3=new Scanner(System.in);
        student1.phisicsMarks=input3.nextInt();

        System.out.println("Enter student's chemistry Marks : ");
        Scanner input4=new Scanner(System.in);
        student1.chemistryMarks=input4.nextInt();

        System.out.println("Enter student's maths Marks : ");
        Scanner input5=new Scanner(System.in);
        student1.mathsMarks=input5.nextInt();

        System.out.println();
        System.out.println("details of science student : ");
        System.out.println("Name : "+student1.name);
        System.out.println("Address : "+student1.address);
        System.out.println("phisics Marks : "+student1.phisicsMarks);
        System.out.println("chemistry Marks : "+student1.chemistryMarks);
        System.out.println("maths Marks : "+student1.mathsMarks);
        int percent= student1.getPercentage();
        System.out.println("Overall percentage : "+percent+" %");

        System.out.println();
        System.out.println("********************************");
        System.out.println();


        HistoryStudent student2=new HistoryStudent();

        System.out.println("Enter details of history student  ");
        System.out.println("Enter student's name : ");
        Scanner input6=new Scanner(System.in);
        student2.name=input6.nextLine();

        System.out.println("Enter student's address : ");
        Scanner input7=new Scanner(System.in);
        student2.address=input7.nextLine();

        System.out.println("Enter student's history Marks : ");
        Scanner input8=new Scanner(System.in);
        student2.historyMarks=input8.nextInt();

        System.out.println("Enter student's civics Marks : ");
        Scanner input9=new Scanner(System.in);
        student2.civicsMarks=input9.nextInt();



        System.out.println();
        System.out.println("details of history student : ");
        System.out.println("Name : "+student2.name);
        System.out.println("Address : "+student2.address);
        System.out.println("history Marks : "+student2.historyMarks);
        System.out.println("civics Marks : "+student2.historyMarks);
        int percent_h= student2.getPercentage();
        System.out.println("Overall percentage : "+percent_h+" %");


    }

}
