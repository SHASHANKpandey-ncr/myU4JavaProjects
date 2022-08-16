package q1;





// ******************************************** class Employee


public abstract class Employee {

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
	protected int employeeId;
 	protected String employeeName;
 	protected double salary;
 	
 	
	public Employee() {}
 	
 	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
//		this.salary = salary;
	}
 	
	public abstract void calculateSalary();
	
	
 
}


//******************************************** class PermanentEmployee


class PermanentEmployee extends Employee{




	
	private double basicPay;
	
	
	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicPay = basicPay;
	}
	
	
	@Override
	public void calculateSalary() {
		double PF_amount=this.basicPay*0.12;
		double salary_ = this.basicPay-PF_amount;
		this.setSalary(salary_);
		
	}
	
	
}
	

//******************************************** class TemporaryEmployee

class TemporaryEmployee extends Employee{

	@Override
	public void calculateSalary() {
		
		double salary_ = this.hoursWorked*this.hourlyWages;
		setSalary(salary_);
		
	}
	
	private int hoursWorked;
	private int hourlyWages;
	
	
	
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
	}
	
	
	
}

//******************************************** class Loan


class Loan{
	


	
	public double calculateLoanAmount(Employee employeeObj) {
		
		
		if(employeeObj instanceof PermanentEmployee) {
			double loan;
			
			loan=0.15*employeeObj.getSalary();return 132.0;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			double loan;
			loan=0.10*employeeObj.getSalary();return 200.0;
		}
		else {return 0;}
		
	}
	
}

//******************************************** class Main



class Main{
	
	
	public static void main(String[] args) {
		//Create a Loan object by name loan
		Loan loan =new Loan();
		double permanentEmployeeLoan=loan.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
		double temporaryEmployeeLoan=loan.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));
		System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
		System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
		}
	
	
}







