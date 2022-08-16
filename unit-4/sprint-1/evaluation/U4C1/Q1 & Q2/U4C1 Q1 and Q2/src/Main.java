
// Solution of Q1 & Q2 is in this file.


// Solution of Q2 *******************************************************
public class Main {

    void printMonths(String month){
        if(month=="JAN"){
            System.out.println("This is the 1st Month of the Year January");
        }
        if(month=="FEB"){
            System.out.println("This is the 2nd Month of the Year February");
        }
        if(month=="MAR"){
            System.out.println("This is the 3rd Month of the Year March");
        }
        if(month=="APR"){
            System.out.println("This is the 4th Month of the Year April");
        }
        if(month=="MAY"){
            System.out.println("This is the 5th Month of the Year May");
        }
        if(month=="JUN"){
            System.out.println("This is the 6th Month of the Year June");
        }
        if(month=="JUL"){
            System.out.println("This is the 7th Month of the Year July");
        }
        if(month=="AUG"){
            System.out.println("This is the 8th Month of the Year August");
        }
        if(month=="SEP"){
            System.out.println("This is the 9th Month of the Year September");
        }
        if(month=="OCT"){
            System.out.println("This is the 10th Month of the Year October");
        }
        if(month=="NOV"){
            System.out.println("This is the 11th Month of the Year November");
        }
        if(month=="DEC"){
            System.out.println("This is the 12th Month of the Year December");
        }


    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.printMonths("MAR");
    }

}
// Solution of Q2 end *******************************************************

// Solution of Q1 *******************************************************

    /* Q1) Differentiate between JRE,JVM and JDK?

    Ans : JDK - JDK refers to Java Development Kit. It is the software for developing and executing
          Java applications.
          JDK = JRE+Development tools.

          JRE - JRE refers to Java Runtime Environment. JRE consists of JVM and some predefined
          classes.
          JRE = JVM + Predefined Library Classes.

          JVM - JVM refers to Java Virtual Machine. The JVM takes java byte-code and translates
          it to the native code for the underlying OS. It is a component of JRE.
     */

// Solution of Q1 end *******************************************************