package Q1;

import java.util.Scanner;

public class Car {
    int numberOfPassenger;

//    public int getNumberOfPassenger() {
//        return numberOfPassenger;
//    }
//
//    public void setNumberOfPassenger(int numberOfPassenger) {
//        this.numberOfPassenger = numberOfPassenger;
//    }

    int numberOfKms;

//    public int getNumberOfKms() {
//        return numberOfKms;
//    }
//
//    public void setNumberOfKms(int numberOfKms) {
//        this.numberOfKms = numberOfKms;
//    }


}

class Sedan extends Car{
    final int farePerKm =20;
}

class HatchBack extends Car{
    final int farePerKm =15;

}

class OLA{
    public Car bookCar(int numberOfPassenger, int numberOfKMs){

        if(numberOfPassenger<=3){return new HatchBack();}
        else{return new Sedan();}

    }

    public int calculateBill(Car car){

        if(car instanceof HatchBack){
            int Total_fare;
            HatchBack obj=new HatchBack();
             Total_fare = car.numberOfKms*15;
//            return Total_fare;
            System.out.println("The total fare amount is : "+ Total_fare);
        }
        else if(car instanceof Sedan){
            int Total_fare;
            Sedan obj=new Sedan();
             Total_fare = car.numberOfKms*20;
//            return Total_fare;
            System.out.println("The total fare amount is : "+ Total_fare);
        }
        return 0;
    }

}

class Main{

    public static void main(String[] args) {
        OLA myOla = new OLA();
        Car car=new Car();

        System.out.println("Enter numberOfPassenger :");
        Scanner scanner = new Scanner(System.in);
        car.numberOfPassenger=scanner.nextInt();

        System.out.println("Enter numberOfKms :");
        Scanner scanner1 = new Scanner(System.in);
        car.numberOfKms=scanner1.nextInt();

        Car myCar = myOla.bookCar(car.numberOfPassenger, car.numberOfKms);
        myOla.calculateBill(myCar);

    }

}
