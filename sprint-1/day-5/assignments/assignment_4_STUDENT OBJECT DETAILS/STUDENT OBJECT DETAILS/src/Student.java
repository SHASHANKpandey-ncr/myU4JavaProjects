public class Student {

    int roll;
    int marks;
    String name;

    void displayStudentDetails(){
        System.out.println("Roll is : "+roll);
        System.out.println("Name is : "+name);
        System.out.println("Marks is : "+marks);
    }

    public static void main(String[] args) {
        Student Student1=new Student();
        Student1.roll=12;
        Student1.name="SP";
        Student1.marks=89;
        Student1.displayStudentDetails();

        System.out.println("======================");

        Student Student2=new Student();
        Student2.roll=14;
        Student2.name="NP";
        Student2.marks=99;
        Student2.displayStudentDetails();

    }
}
