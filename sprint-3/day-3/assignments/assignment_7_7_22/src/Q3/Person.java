package Q3;

public class Person {
    Address address;
    String name;
    String gender;

}

class Address{

    String city ;
    String state ;
    String pinCode ;

}

class Instructor extends Person{
    int instructorId;
    int salary;





}

class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;
}

abstract class Main{

    public static  Person generatePerson(Person person){


                return person;
    }
}



abstract class  a{

      abstract void  find();

        }


  class B extends a{

    @Override
    void  find(){

    }


}
