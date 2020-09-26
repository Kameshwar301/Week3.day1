package week3.day1;

public class Students {
	//getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	public void getStudentInfo(int id) {
			System.out.println("Id:"+id);
			
	}
public void getStudentInfo(int id, String name) {
	System.out.println(id+" "+name);
	
}
public void getStudentInfo(String email, Long phoneNumber) {
	System.out.println(email+" "+phoneNumber);
}
	public static void main(String[] args) {
		Students stu = new Students();
		
	
		stu.getStudentInfo(100);

		stu.getStudentInfo(100, "Sasuke");
		stu.getStudentInfo("sasuke@gmail.com", 8965317592l);
	}
}
