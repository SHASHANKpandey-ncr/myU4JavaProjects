package Q1;
// object downCasting, method overriding, inheritance 
public class Bird {

    public void fly() {
        System.out.println("Bird is flying");
    }
}

     class Parrot extends Bird{
         @Override
         public void fly() {
             System.out.println("I am Flying");
         }

         public void sing(){
             System.out.println("I am Singing");
         }
    }
    class Main{

        public static void main(String[] args){
            Bird b1 = new Parrot();
            b1.fly();

           // b1.sing(); // not allowed

           Parrot b= (Parrot) b1;  //downcasting parent class variable to the child class object

           b.sing(); // allowed
        }
    }





