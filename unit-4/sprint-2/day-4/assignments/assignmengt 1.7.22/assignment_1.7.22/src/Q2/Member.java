package Q2;

        public class Member {


            String Name;
            int Age;
            String Phone_number;
            String Address;
            double Salary;
            void printSalary(){
                System.out.println(Salary);
            }
            void printDetails(){
                System.out.println(Name);
                System.out.println(Age);
                System.out.println(Phone_number);
                System.out.println(Address);
            }

        }

        class Employee extends Member{
            String Specialisation;
            String Department;
        }

        class Manager extends Member{
            String Specialisation;
            String Department;
        }

        class Main{


            public static void main(String[] args) {
                Employee employee = new Employee();

                employee.Name="NP";
                employee.Age=25;
                employee.Phone_number="7878787878";
                employee.Address="SE 666";
                employee.Salary=540000;
                employee.Department="Operations";
                employee.Specialisation="Data Analytics";
                employee.printDetails();
                employee.printSalary();

                System.out.println();

                Manager manager = new Manager();

                manager.Name="SP";
                manager.Age=22;
                manager.Phone_number="7879555555";
                manager.Address="SE 674";
                manager.Salary=1070000;
                manager.Department="Web application Tech";
                manager.Specialisation="Backend Development";
                manager.printDetails();
                manager.printSalary();



            }

        }