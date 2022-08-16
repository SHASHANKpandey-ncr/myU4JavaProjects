public class Prime_factorial {

        public static void main(String[] args){

            int n=60;
            if(n>2&&n<100){
                for(int i=1;i<=n;i++)
                {
                    if(n%i==0){
                        System.out.println(i);
                    }
                }
            }
            else{
                System.out.println("Invalid number");
            }

        }

}
