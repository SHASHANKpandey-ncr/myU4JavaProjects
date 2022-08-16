package practice2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// *******************************************************

public class Student {

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}
	private int roll;
	private String name;
	private int marks;
	
	public Student() {}
	
	public Student(int roll,String name,int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	
}

//*******************************************************



class Main{

	public static void main(String[] args) {
		
		Set<Student> students=new HashSet<>();
		
		students.add(new Student(12,"sp",99));
		students.add(new Student(15,"np",90));
		students.add(new Student(12,"sp",99));
		students.add(new Student(15,"np",90));
		
		System.out.println(students.size());
		System.out.println(students);
	}
	
	
}







