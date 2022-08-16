package Q2;

import java.util.Scanner;

public class HR {


    int age;
    int avg;
    int total;
    int no_of_emp;

    public int calculateAverage(){
        System.out.println("Enter total no.of employees : ");
        Scanner input1=new Scanner(System.in);
        no_of_emp=input1.nextInt();

        if(no_of_emp<=1){
            System.out.println("Please enter a valid employee count");
        }
        else{
            total=0;
            for(int i=0;i<no_of_emp;i++){
                System.out.println("Enter the age for employee " +(i+1)+ ": ");
                Scanner input2=new Scanner(System.in);
                total=total+input2.nextInt();
            }
            System.out.println("The average age is : "+total/no_of_emp);
        }
        return total;

    }

    public static void main(String[] args) {
        HR obj=new HR();
        obj.calculateAverage();
    }
}
