package Q3;

public class Student {
        int roll;
        String name;
        String address;
        String collageName;

        Student(int roll,String name,String address){
            this.roll=roll;
            this.name=name;
            this.address=address;
            this.collageName="NIT";
        }

        Student(int roll,String name,String address,String collageName){
            this.roll=roll;
            this.name=name;
            this.address=address;
            this.collageName=collageName;
        }

    public static Student getStudent(boolean isFromNIT,int roll,String name,String address,String collageName){
        if(isFromNIT){
            Student obj1=new Student(roll,name,address);
            return obj1;
        }
        else{
            Student obj2=new Student(roll,name,address,collageName);
            return obj2;
        }
    }
    void displayData(){
        System.out.println("student roll : "+roll);
        System.out.println("student name : "+name);
        System.out.println("student address : "+address);
        System.out.println("student collage name : "+collageName);
    }

    public static void main(String[] args) {
        Student student1=getStudent(true,105,"sp","se674","");
        student1.displayData();

        System.out.println();

        Student student2=getStudent(false,205,"np","se700","BIT");
        student2.displayData();
    }
}
