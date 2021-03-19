package workTask;
public class Factorial {
	public int box(int fc) {
		int i,fact=1;  
		  int number=fc;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact*=i;    
		  }
		return fact;    
	}
	public long BoxRecursion(int fc) {
	    if (fc == 1) {
	        return fc;
	    } else {
	        return fc * BoxRecursion(--fc);
	    }
	}
	public static void main(String[] args) {
		int fc=5;
		Factorial check= new Factorial();
		System.out.println("normal:- factorial of "+fc+" is "+check.box(fc));
		System.out.println("Recursion:- factorial of "+fc+" is "+check.BoxRecursion(fc));
		
	}
}
