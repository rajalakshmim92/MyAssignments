package week1.day1.assignments;

public class Mobile3 {
		
public void makeCall() {
	
	System.out.println("Make a call");
	String mobileModel ="oneplus";
	System.out.println("Mobile model is:"+mobileModel);
	float mobileWeight =180.5f;
	System.out.println("Moile weight is:"+mobileWeight);
		
}

public void sendSms() {
	System.out.println("Send sms");
	boolean isCharged=true;
	System.out.println("Mobile is charged:"+isCharged);
	int cost=25000;
	System.out.println("Mobile cost:"+cost);
	

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile3 method=new Mobile3();
method.makeCall();
method.sendSms();
System.out.println("This is my mobile");
	}

}
