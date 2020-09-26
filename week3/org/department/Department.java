package week3.org.department;

import week3.org.college.College;

public class Department extends College {
	public void deptName() {
		System.out.println("Mechatronics");
	}

	public static void main(String[] args) {
		Department dept = new Department();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
		dept.deptName();

	}

}
