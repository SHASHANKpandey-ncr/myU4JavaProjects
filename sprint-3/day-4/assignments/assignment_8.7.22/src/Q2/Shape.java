package Q2;

import java.util.Scanner;

public abstract class Shape {

    public abstract int rectangleArea(int length, int breadth);
    public abstract int squareArea(int side);
    public abstract double circleArea(double radius);


}

class Area extends Shape{

    @Override
    public double circleArea(double radius) {

        System.out.println("enter value radius of circle  : ");
        Scanner input1=new Scanner(System.in);
        radius=input1.nextInt();

        return (3.14)*radius*radius;
    }

    @Override
    public int rectangleArea(int length, int breadth) {


        System.out.println("enter value length of rectangle  : ");
        Scanner input2=new Scanner(System.in);
        length=input2.nextInt();
        System.out.println("enter value breadth of rectangle  : ");
        Scanner input3=new Scanner(System.in);
        breadth=input3.nextInt();

        return length*breadth;
    }

    @Override
    public int squareArea(int side) {

        System.out.println("enter value side of square  : ");
        Scanner input4=new Scanner(System.in);
        side=input4.nextInt();
        return side*side;
    }
}


class Main{

    public static void main(String[] args) {
        Area obj=new Area();
        double ans=obj.circleArea(0);
        System.out.println("Arae of circle : "+ans);
        System.out.println();

        int ans1=obj.rectangleArea(0,0);
        System.out.println("Arae of rectangle : "+ans1);
        System.out.println();

        int ans2=obj.squareArea(0);
        System.out.println("Arae of square : "+ans2);
        System.out.println();


    }


}