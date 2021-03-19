package workTask;

import java.util.Scanner;

public class OddEvenNumber {
	
	public void calculateNum() {
		System.out.println("Please enter the number...... ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if (num%2==0) {
			System.out.println("given number"+ num +" is even");
		}else {
			System.out.println("given number"+ num +" is odd");
		}
	}
	
	
	
	
}
