package maven.day1;

public class Mobile {
	
	boolean isWorking = true;
	int price= 15000;
	char chargerType= 'C';
	String brandName= "EDITH";
	
	public void typeOfCharger() {
		System.out.println(chargerType+ " type charger pin");
		workingCondition();
		branOfMobile();
		
	}
	boolean workingCondition() {
		System.out.println("Working condition="+ isWorking);
		return isWorking;
	}

	String branOfMobile() {
		System.out.println(brandName+" is the brand name");
		return brandName;
	}
}
