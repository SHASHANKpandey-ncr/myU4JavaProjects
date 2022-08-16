package Q3;

import java.util.Stack;
import java.util.*;

public class Main {

    static boolean checkPrime(int n){
        int fact=0;boolean prime=false;
        for(int i=1;i<=n;i++){
            if(n%i==0){fact++;}
        }
        if(fact==2)prime=true;
        return  prime;
    }

    public int[] findAndReturnPrimeNumbers(int[] inputArray){

        Stack stk=new Stack();
        for(int i=0;i<inputArray.length;i++){
            if(checkPrime(inputArray[i])){
                stk.push(inputArray[i]);
            }
        }
            int[] ans=new int[stk.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=(Integer)stk.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Main obj=new Main();

        int[] arr = {10,12,5,50,11,14,15};
        int[] ans;
        ans=obj.findAndReturnPrimeNumbers(arr);

        if(ans.length>0){
            for (int an : ans) {
                System.out.println(an);
            }
        }
        else{
            System.out.println("Prime number not found in the supplied Array");
        }
    }
}
