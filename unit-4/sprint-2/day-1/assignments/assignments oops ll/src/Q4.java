 class Check {

    void check(int i){

        if(i%2==1){
            System.out.println(i);
        }
        else if (i%2==0&&i>0) {
            int j=i/10;
            int x=(j+1)*10;
            System.out.println(x);
        }
        else if (i<0) {
            System.out.println("Error");
        }
    }

     public static void main(String[] args) {
         Check obj=new Check();
         obj.check(1036456468);
     }
}
