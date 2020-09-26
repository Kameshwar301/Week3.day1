package week3.org.student;

import week3.org.department.Department;

public class Student extends Department{
	//studentName(),studentDept(),studentId()
	public void studentName() {
		System.out.println("The name of studen is Sasuke");
	}
	public void studentDept() {
		System.out.println("Mechatronics Department");
	}
	public void studenId() {
		System.out.println("The id number is MNW1901");

	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studenId();
	}
}
