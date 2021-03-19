package workTask;
public class SumOfDigits {

	int traditionalSum(int num) {
		int Reminder,Sum = 0,Number=num;
		while(Number > 0) {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
		return Sum;
	}
	int stringSum(String num) {
		int Number = 0;
				char[] ch = num.toCharArray(); 
        for (char c : ch) { 
        	Number+=	Character.getNumericValue(c);
        }return Number;
	}
	
	int strBtwNumSum(String num) {
		int Number = 0;
		int Sum = 0;
		String newNum=num.replaceAll("\\D", "");
				char[] ch = newNum.toCharArray(); 
        for (char c : ch) { 
        	Number+=	Character.getNumericValue(c);
        }return Number;
	}
	
	public static void main(String[] args) {
		int sumnum=555;
		String sumnum2="555";
		String sumnum3="we55r5";
		SumOfDigits check= new SumOfDigits();
		System.out.println("Integer:- Sum of digits "+sumnum+" is "+check.traditionalSum(sumnum));
		System.out.println("String:- Sum of digits "+sumnum2+" is "+check.stringSum(sumnum2));
		System.out.println("StringbtwNum:- Sum of digits "+sumnum2+" is "+check.strBtwNumSum(sumnum3));
	}

}