package q2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
		
}
class EmployeeSalaryComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getSalary()>e2.getSalary())return 1;
		else if(e1.getSalary()<e2.getSalary())return -1;
		else return e1.getEmpName().compareTo(e2.getEmpName());
		
	}
	
}

class Main{
		public static void main(String[] args) {
			
				TreeSet<Employee> ts=new TreeSet<>(new EmployeeSalaryComp());
			int i=0;
			while(true) {
				System.out.println("Employee "+(i+1)+" details: ");
				
				System.out.println("Enter empId");
				Scanner sc=new Scanner(System.in);
				int empId=sc.nextInt();
				
				System.out.println("Enter empName");
				Scanner sc1=new Scanner(System.in);
				String empName=sc1.nextLine();
				
				System.out.println("Enter salary");
				Scanner sc2=new Scanner(System.in);
				double salary=sc2.nextDouble();
				
				System.out.println("Employee "+(i+1)+" details done ");
				System.out.println("Want to add more Employees ?? (y/n) : ");
				ts.add(new Employee(empId, empName, salary));i++;
				Scanner sc3=new Scanner(System.in);
				if(sc3.nextLine().equalsIgnoreCase("n")) {break;}
				
			}
			
					System.out.println("========");
					
					for(Employee employee:ts) {
						System.out.println();
						System.out.println("empId "+employee.getEmpId());
						System.out.println("empName "+employee.getEmpName());
						System.out.println("salary "+employee.getSalary());
						System.out.println();
					}
			
		}
}


// TreeSet
// using treeSet
// EmployeeSalaryComp Comparator class to sort ac to salary-name
// bean class object add to TreeSet
// taking input in a loop








