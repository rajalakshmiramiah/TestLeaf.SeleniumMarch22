package week1.day1;
public class Mobile {
	String mobileModel = "OnePlus";
    float mobileWeight =156.43f;
    boolean isFullCharged =true ;
    int mobileCost = 34500;
	
	public void makeCall() {
		String mobileModel = "Samsung";
		System.out.println("The updated model of mobile within this method is "+mobileModel);
		System.out.println("Method making a Call");
	}
	
	public void sendMessage() {
		isFullCharged = false ;
		System.out.println("Method sending a Message");
	}
	public static void main(String[] args) {
		System.out.println("Code inside the main method getting executed");
		Mobile newMobileobj = new Mobile();
		newMobileobj.makeCall();
		newMobileobj.sendMessage();
		System.out.println("The model of mob is "+newMobileobj.mobileModel);
		System.out.println("The weight of mob is "+newMobileobj.mobileWeight +"gms");
		System.out.println("Is the mob fullycharged - "+newMobileobj.isFullCharged);
		System.out.println("Cost of mob is rs:"+newMobileobj.mobileCost);
	}
}
