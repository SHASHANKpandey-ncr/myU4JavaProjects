package Q1;



    import java.util.Scanner;

public class Main {

    public static String reversString(String input){
    //write the logic
        String ans="";
        for(int i=input.length()-1;i>=0;i--){
            ans=ans+input.charAt(i);
        }
        System.out.println();
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.nextLine();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }


}
