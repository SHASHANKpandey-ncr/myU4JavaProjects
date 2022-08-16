package Q1;

import java.util.Scanner;

public class Course {

        int courseId;
        String courseName;
        int courseFee;

        void displayCourseDetails(){
            System.out.println("Course ID : "+courseId);
            System.out.println("Course name : "+courseName);
            System.out.println("Course fee : "+courseFee+" INR");
        }

        static void authenticate(String username,String password){
                if(username=="Admin"&&password=="1234"){
                    Course obj=new Course();

                    System.out.println("Set Course ID :");
                    Scanner input1=new Scanner(System.in);
                    obj.courseId=input1.nextInt();

                    System.out.println("Set Course name :");
                    Scanner input2=new Scanner(System.in);
                    obj.courseName=input2.nextLine();

                    System.out.println("Set Course fee :");
                    Scanner input3=new Scanner(System.in);
                    obj.courseFee=input3.nextInt();

                    System.out.println();

                    obj.displayCourseDetails();
                }
                else{
                    System.out.println("Invalid Username or password");
                }
        }

    public static void main(String[] args) {

        authenticate("Admin","1234");

        System.out.println();

        authenticate("Admin","1235");


    }
}
