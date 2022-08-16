 class Student {

     int roll;
     String name;
     int age;
     int marks;

     Student(){                             //zero argument constructor
          roll=999;
          name="sp";
          age=25;
          marks=100;
     }

     Student(int roll, String name, int age, int marks){     // parameterized constructor
          this.roll=roll;
          this.name=name;
          this.age=age;
          this.marks=marks;
     }
     void displayData(){
          System.out.println("student roll : "+roll);
          System.out.println("student name : "+name);
          System.out.println("student age : "+age);
          System.out.println("student marks : "+marks);
          System.out.println("");
     }


     public static void main(String[] args) {
          Student student1=new Student();
          student1.displayData();

          Student student2=new Student(799,"np",20,99);
          student2.displayData();
     }
}
