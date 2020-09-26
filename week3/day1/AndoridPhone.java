package week3.day1;

public class AndoridPhone extends Mobile {
	public void takeVideo() {
		// TODO Auto-generated method stub
System.out.println("Videos is taken");
	}

	public static void main(String[] args) {
		
        AndoridPhone ap = new AndoridPhone();
        ap.sendMsg();
        ap.makeCall();
        ap.saveContact();
        ap.takeVideo();
        
	}

}
