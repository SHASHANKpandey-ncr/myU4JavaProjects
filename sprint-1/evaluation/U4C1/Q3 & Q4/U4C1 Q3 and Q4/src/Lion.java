
// This file contains solution of Q3 & Q4

// solution of Q3 ***********************************************
public class Lion {

    String name;            // non static variable
    boolean isHungry;       // non static variable
    int age;                // non static variable
    static int totalDeaths; // static variable
    static void printKillings(){
        System.out.println("Total killings by lions in jungle = "+totalDeaths);
    }
    void thinking(){
        if(isHungry==false){
            System.out.println(name+" is sleeping");
        }
        if(isHungry==true&&age>12){totalDeaths=totalDeaths+2;
            System.out.println(name+" has eaten two animals");}
        if(isHungry==true&&age<=12&&age>=2){totalDeaths=totalDeaths+1;
            System.out.println(name+" has eaten one animals");}
        if(isHungry==true&&age<=2){
            System.out.println(name+" is calling Mom");}

    }

    public static void main(String[] args) {
        Lion lion1=new Lion();
        lion1.name="loin1";
        lion1.age=15;
        lion1.isHungry=true;
        lion1.thinking();

        Lion lion2=new Lion();
        lion2.name="loin2";
        lion2.age=10;
        lion2.isHungry=true;
        lion2.thinking();

        Lion lion3=new Lion();
        lion3.name="loin3";
        lion3.age=1;
        lion3.isHungry=false;
        lion3.thinking();

        printKillings();

    }
}
// solution of Q3 end***********************************************

// solution of Q4 ***********************************************

   /* Q4) Differentiate between static and non-static variables?

        Ans : Static variables : Static variables are loaded to RAM first and these static
              variables can be accessed directly in the main function of java class. For examples
              refer to the above solution.

              Non-Static variables : Static variables are not loaded to RAM first and these non-static
              variables will be there inside hard disk in the form of bytecode in the dot class
              files.These non-static variables can't be accessed directly in the main function of
              java class. For examples refer to the above solution.
    */

// solution of Q4 end***********************************************