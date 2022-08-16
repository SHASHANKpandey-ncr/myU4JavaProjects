package Q4;

public class Factorial {

    public static void main(String[] args) {

        if(args.length==1){
            int fact=1;
            int n=Integer.parseInt(args[0]);
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println(fact);
        }
        else if(args.length==2){
            int fact=1;
            int n=Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println(fact);
        }
        else{
            System.out.println("Error");
        }

    }

}
