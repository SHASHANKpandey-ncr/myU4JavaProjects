package practice1;

import java.util.ArrayList;
import java.util.Scanner;

//******************************************************

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

	private int roll;
	private String name;
	private int marks;

	public Student() {
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

}

//******************************************************

class Main {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();

		int count = 1;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("enter details of student " + count++);
			System.out.println("enter roll : ");
			int roll = sc.nextInt();

			System.out.println("enter name : ");
			String name = sc.next();

			System.out.println("enter marks : ");
			int marks = sc.nextInt();

			Student student = new Student(roll, name, marks);

			students.add(student);

			System.out.println("want more (y/n) ?? : ");
			String choice = sc.next();
			System.out.println();

			if (choice.equalsIgnoreCase("n"))
				break;
		}

		int i=0;
		for (Student student : students) {
			System.out.println((i+1)+""+student);i++;
			System.out.println("roll : " + student.getRoll());
			System.out.println("name : " + student.getName());
			System.out.println("marks : " + student.getMarks());
			
			System.out.println();
		}

	}

}
