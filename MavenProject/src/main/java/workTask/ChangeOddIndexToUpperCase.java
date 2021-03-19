package workTask;
public class ChangeOddIndexToUpperCase {
	void upperCase(String convert) {
		char[] charray= convert.toCharArray();
		for (int i=0;i<charray.length;i++) {
			if((i)%2!=0) {
				charray[i]=	Character.toUpperCase(charray[i]);
				}
		} String converted=new String(charray);
		System.out.println("Old String: "+convert+"\nConverted String: "+converted);
	}
	public static void main(String[] args) {
		ChangeOddIndexToUpperCase up=new ChangeOddIndexToUpperCase();
		up.upperCase("jotheesh");
	}
}
