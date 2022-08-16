package Q4;

import java.util.Scanner;

public class Input {


    public static void main(String[] args) {
        Scanner get_input=new Scanner(System.in);

        System.out.println("Enter the String:");
        String str=get_input.nextLine();

        System.out.println();

        System.out.println("Enter the character position you want to access:");
        int n=get_input.nextInt();

        System.out.println("Character at position/index "+n+" is : "+str.charAt(n));

        System.out.println();

        System.out.println("thanks for using my app. Run again to check more.");
    }
}
