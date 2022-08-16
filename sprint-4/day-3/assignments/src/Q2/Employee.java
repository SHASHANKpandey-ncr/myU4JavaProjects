package Q2;

import java.util.Scanner;

public class Employee {
	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
//	Employee obj=new Employee();
	


	public void calculateNetSalary(int pfPercentage) {
		double sal=getSalary();
		double fin_sal=sal*(100-pfPercentage)*0.01;
		setNetSalary(fin_sal);
	}
}

class Main{
	
	public static int getPFPercentage() {
		
		System.out.println("Enter PF percentage : ");
		Scanner input=new Scanner(System.in);
		int pf=input.nextInt();
		
		return pf;
	}
	
	public static Employee getEmployeeDetails() {
		
		Employee obj=new Employee();
		
		System.out.println("Enter Id : ");
		Scanner input1=new Scanner(System.in);
		obj.setEmployeeId(input1.nextInt());
		
		System.out.println("Enter Name : ");
		Scanner input2=new Scanner(System.in);
		obj.setEmployeeName(input2.nextLine());
		
		System.out.println("Enter salary : ");
		Scanner input3=new Scanner(System.in);
		obj.setSalary(input3.nextDouble());
		
		int x=getPFPercentage();
		
		obj.calculateNetSalary(x);
		
		
		System.out.println("**********************");
		
		System.out.println("ID : "+obj.getEmployeeId());
		System.out.println("Name : "+obj.getEmployeeName());
		System.out.println("Salary : "+obj.getSalary());
		System.out.println("Net Salary : "+obj.getNetSalary());
		
		
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		
		getEmployeeDetails();
		

	}
	
	
	
	
}




















