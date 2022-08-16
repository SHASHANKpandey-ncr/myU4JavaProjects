package Q3;

import java.util.Scanner;

class Circle{
        int radius;
    }

    class Rectangle{
        int length;
        int breadth;
        }

    class Square{
        int side;
        }



public class Shapes {

    public void area(Circle circle){
        System.out.println("Enter value of radius of circle : ");
        Scanner input=new Scanner(System.in);
        circle.radius=input.nextInt();
        double x=(3.14)*circle.radius*circle.radius;
        System.out.println("The area of circle is : "+x);
    }

    public void area(Rectangle rectangle){
        System.out.println("Enter value of length of rectangle : ");
        Scanner input1=new Scanner(System.in);
        rectangle.length=input1.nextInt();
        System.out.println("Enter value of breadth of rectangle : ");
        Scanner input2=new Scanner(System.in);
        rectangle.breadth=input2.nextInt();
        double y= rectangle.length* rectangle.breadth;
        System.out.println("The area of rectangle is : "+y);
    }

    public void area(Square square){
        System.out.println("Enter value of side of square : ");
        Scanner input=new Scanner(System.in);
        square.side=input.nextInt();
        double z= square.side*square.side;
        System.out.println("The area of square is : "+z);
    }

}

    class Main{
        public static void main(String[] args) {

            Shapes obj=new Shapes();

            Circle obj1=new Circle();
//            obj1.radius=7;      use this if no input is accepted
            obj.area(obj1);                             // returns area of circle

            System.out.println();

            Rectangle obj2=new Rectangle();
            obj.area(obj2);                            // returns area of rectangle

            System.out.println();

            Square obj3=new Square();
            obj.area(obj3);                            // returns area of square


        }
    }
