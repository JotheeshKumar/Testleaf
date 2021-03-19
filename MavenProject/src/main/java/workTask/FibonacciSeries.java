package workTask;

public class FibonacciSeries {
		public static int fibonacciRecursion(int n){
		if(n == 0){return 0;}
		if(n == 1 || n == 2){return 1;}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);}
	void fib(int range) {
		int	firstNum =0; 
		int secNum = 1;
		int sum;
		System.out.println("fibonacci series of range= "+range);
		System.out.print(firstNum+" ");
		System.out.print(secNum);
		for(int i=2;i<range;i++) {
			sum=firstNum+secNum;
			firstNum= secNum;
			secNum=sum;
			System.out.print(" "+sum);
		}
	}
	public static void main(String[] args) {
		FibonacciSeries fi=new FibonacciSeries();
		int range = 8;
		fi.fib(range);
		System.out.println("\nFibonaci using Recursion...");
		for(int i = 0; i < range; i++){System.out.print(fibonacciRecursion(i) +" ");
		}
	}
}