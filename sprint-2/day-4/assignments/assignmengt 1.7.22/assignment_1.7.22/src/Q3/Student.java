package Q3;

import java.util.Scanner;
import java.util.Stack;

public class Student {

    int roll;
    String name;
    String address;
    int marks;

}

class Demo{
    public static void main(String[] args) {
        int sum=0;
        Student student=new Student();

        System.out.println("Enter the number of students : ");
        Scanner input=new Scanner(System.in);
        int student_count=input.nextInt();

         Student[] arr=new Student[student_count];

        Stack stk=new Stack<>();

        for(int i=0;i<student_count;i++){
            System.out.println("Student : "+(stk.size()+1)+"- Enter student's roll no. : ");
            Scanner input1=new Scanner(System.in);
            student.roll=input1.nextInt();

            System.out.println("Student : "+(stk.size()+1)+"- Enter student's name : ");
            Scanner input2=new Scanner(System.in);
            student.name=input2.nextLine();

            System.out.println("Student : "+(stk.size()+1)+"- Enter student's address : ");
            Scanner input3=new Scanner(System.in);
            student.address=input3.nextLine();

            System.out.println("Student : "+(stk.size()+1)+"- Enter student's marks : ");
            Scanner input4=new Scanner(System.in);
            student.marks=input4.nextInt();


            stk.push(student);


            arr[i]=(Student) stk.get(i);

            System.out.println();

            System.out.println("Student "+(i+1)+" Details : ");
            System.out.println("Student "+(i+1)+" roll = "+arr[i].roll);
            System.out.println("Student "+(i+1)+" name = "+arr[i].name);
            System.out.println("Student "+(i+1)+" address = "+arr[i].address);
            System.out.println("Student "+(i+1)+" marks = "+arr[i].marks);

            System.out.println();
            sum=sum+arr[i].marks;
        }




        System.out.println();
        System.out.println("Average marks of all students is : "+(sum/arr.length));
    }
}
