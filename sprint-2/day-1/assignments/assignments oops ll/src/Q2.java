 class Demo {
    String s;
    int i;
    double f;
    Demo(){
        s="sp";
        System.out.println(s);
    }

     Demo(String s){
         this.s=s;System.out.println(s);
     }

     Demo(int i){
         this.i=i;System.out.println(i);
     }

     Demo(double f){
         this.f=f;System.out.println(f);
     }

     public static void main(String[] args) {
         Demo obj=new Demo();
         System.out.println(obj);

         Demo obj1=new Demo("np");
         System.out.println(obj1);

         Demo obj2=new Demo(10);
         System.out.println(obj2);

         Demo obj3=new Demo(2.2);
         System.out.println(obj3);
     }
}
