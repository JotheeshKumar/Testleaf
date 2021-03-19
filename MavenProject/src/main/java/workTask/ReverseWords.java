package workTask;

public class ReverseWords {
	
	void reverse(String currString) {
		String reversed = "" ;
		System.out.println("Normal: "+currString);
		String[] splited = currString.split(" ");
		int lent= splited.length-1;
		for (int i=lent;i>=0;i--) {
			 reversed =reversed + splited[i] +" ";
	    }
			System.out.println("Reversed: "+reversed);
		}
	
	void reverseEven1(String currString) {
		String reversed = "" ;
		System.out.println("Normal: "+currString);
		String[] splited = currString.split(" ");
		int lent= splited.length-1;
		
		for (int i=0;i<lent;i--) {
			 reversed =reversed + splited[i] +" ";
	    }
			System.out.println("Reversed: "+reversed);
		}
	
	void reverseEven(String currString) {
		String reversed = "" ;
		
		System.out.println("Normal: "+currString);
		String[] splited = currString.split(" ");
		int lent= splited.length-1;
		for (int i=0;i<=lent;i++) {
			
			if (i % 2 == 1) {
				 String word = splited[i];
				 String reverseWord = "";
	            for (int j = word.length() - 1; j >= 0; j--) {
	                reverseWord = reverseWord + word.charAt(j);
			}
	            reversed = reversed + reverseWord + " ";
			} else
		    	reversed = reversed + splited[i] + " ";
		}
			System.out.println("Even Reversed: "+reversed);
	}
		
	public static void main(String[] args) {
		String currString="I am a software tester";
		ReverseWords rw=new ReverseWords();
		rw.reverse(currString);
		rw.reverseEven(currString);
	}

	}


