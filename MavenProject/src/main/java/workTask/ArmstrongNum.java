package workTask;
public class ArmstrongNum {
	void armNum(String num) {
		int conum = Integer.parseInt(num);
		int armnum =0;
		int Number = 1;
				char[] ch = num.toCharArray(); 
				for(int j=0;j<=ch.length-1;j++) {
					for (int i=0;i<=ch.length-1;i++) {
						Number*=	Character.getNumericValue(ch[j]);
					}
					 armnum += Number;
					 Number = 1;}
				if(armnum==conum) {
					System.out.println("Provided num "+conum+" is amsrtong number");
				}else {
					System.out.println("Provided num "+conum+" is not amsrtong number");
				}
	}
	public static void main(String[] args) {
		String sumnum="153";
		ArmstrongNum check= new ArmstrongNum();
		System.out.println("Checking the provided number "+sumnum+" is Armstrong or not..."+"\n");
		check.armNum(sumnum);
	}

}

