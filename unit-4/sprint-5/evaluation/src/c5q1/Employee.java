package c5q1;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Employee {

	private int empId;
	private String name;
	private String address;
	
	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}


class EmployeeNameCompSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}


class Main{
	
	public static void main(String[] args) {
		TreeMap<Employee, Integer> tm=new TreeMap<>(new EmployeeNameCompSort());
		tm.put(new Employee(12, "sp", "se674"), 10000);
		tm.put(new Employee(15, "np", "se774"), 20000);
		tm.put(new Employee(04, "rp", "se874"), 30000);
		tm.put(new Employee(20, "mp", "se974"), 40000);
		
		
		Set<Map.Entry<Employee, Integer>> set=tm.entrySet();
		
		for(Map.Entry<Employee, Integer>map:set) {
			Employee employee=map.getKey();
			System.out.println("empId : "+employee.getEmpId());
			System.out.println("name : "+employee.getName());
			System.out.println("address : "+employee.getAddress());
			
			System.out.println("salary : "+map.getValue()+" INR");
			System.out.println();
		}
		
	}

	
	
}

