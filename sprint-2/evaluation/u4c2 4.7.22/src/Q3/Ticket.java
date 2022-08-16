package Q3;

import java.util.Scanner;

public class Ticket {

    public int calculateTicketCost(){
        System.out.println("Enter no of bookings : ");
        Scanner input=new Scanner(System.in);
        int no_of_bookings=input.nextInt();


        System.out.println("Enter the available tickets : ");
        Scanner input1=new Scanner(System.in);
        int available_tickets=input1.nextInt();

        for(int i=0;i<no_of_bookings;i++){
            if(available_tickets<=0){
                System.out.println(-1);return -1;
            }
            System.out.println();
            System.out.println("Enter the ticketid:  ");
            Scanner input3=new Scanner(System.in);
            int ticketid=input3.nextInt();

            System.out.println("Enter the price:  ");
            Scanner input4=new Scanner(System.in);
            int price=input4.nextInt();

            System.out.println("Enter the no of tickets:  ");
            Scanner input5=new Scanner(System.in);
            int no_of_tickets=input5.nextInt();
            System.out.println();
            System.out.println("Available tickets : "+available_tickets);
            System.out.println("Total amount : "+(price*no_of_tickets));
            available_tickets=available_tickets-no_of_tickets;
            System.out.println("Available ticket after booking : "+(available_tickets));


        }

        return available_tickets;

    }

    public static void main(String[] args) {
        Ticket obj=new Ticket();
        obj.calculateTicketCost();
    }



}
