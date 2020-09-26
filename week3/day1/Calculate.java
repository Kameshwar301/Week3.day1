package week3.day1;

public class Calculate {
	
	public void add(int a, int b,int c) {
		int add = a+b;
		System.out.println(add);
		int add1=a+b+c;
		System.out.println(add1);
		
		

	}
public void multiply(int a, double b, int multi) {
      multi= (int) (a*b);
      System.out.println(multi);
      
}
public void subtract(int a, int b) {
		int subt=a-b;
		System.out.println(subt);
}
public void subtrac(double a, double b) {
	double sub=a-b;
	System.out.println(sub);
}
public void dive(int a, int b) {
	// TODO Auto-generated method stub
   int div=a/b;
   System.out.println(div);
}
public static void main(String[] args) {
	Calculate cal = new Calculate();
	cal.add(10, 20, 10);
	cal.subtrac(50, 20);
	cal.subtract(50, 20);
	cal.dive(20, 10);
	
	
	
}
}