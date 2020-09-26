package week3.org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The size of desktop is 14 inch");

	}

	public static void main(String[] args) {
		Desktop desk =new Desktop();
		desk.computerModel();
		desk.desktopSize();

	}

}
