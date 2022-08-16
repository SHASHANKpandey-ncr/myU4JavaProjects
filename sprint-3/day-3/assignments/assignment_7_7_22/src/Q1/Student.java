package Q1;

import java.util.Scanner;
// java bean class, parameterized constructor, private function call, override toString methods
public class Student {

    private int roll;
    private String name;
    private int marks;
    private char grade;


    public  Student (){}

    public Student(int roll,String name,int marks){
        Student student=new Student();
        this.roll=roll;
        this.name=name;
        this.marks=marks;


    }

    public void displayDetails(){
        Student student=new Student();

        System.out.println("Enter student's roll");
        Scanner input1=new Scanner(System.in);
        student.roll=input1.nextInt();

        System.out.println("Enter student's name");
        Scanner input2=new Scanner(System.in);
        student.name=input2.nextLine();

        System.out.println("Enter student's marks");
        Scanner input3=new Scanner(System.in);
        student.marks=input3.nextInt();

        System.out.println();
        System.out.println("Student "+student.name+" details : ");
        student.grade= student.calculateGrade(student.marks);
        System.out.println(student.toString());

    }



    private char calculateGrade(int marks){


        if(marks>=500) {
            grade = 'A';

        }
        else if(marks<500&&marks>=400) {
            grade = 'B';

        }
        else if(marks<400) {
            grade = 'C';

        }

        return grade;

    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }
}

class Demo {

    public static void main(String[] args) {
        Student student1=new Student();
        student1.displayDetails();


        System.out.println();

        Student student2=new Student();
        student2.displayDetails();


    }


}
