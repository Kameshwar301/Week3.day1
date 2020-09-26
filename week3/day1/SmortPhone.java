package week3.day1;

public class SmortPhone extends AndoridPhone {
	/*
	 * public void connectWhatsApp() { System.out.println("Whats App is connted");
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { SmortPhone sp = new SmortPhone();
	 * sp.connectWhatsApp();
	 * 
	 * 
	 * }
	 */
	
	@Override
	public void takeVideo() {
		System.out.println("take");
	}
	public static void main(String[] args) {
		SmortPhone smr = new SmortPhone();
		smr.takeVideo();
		
	}
}
