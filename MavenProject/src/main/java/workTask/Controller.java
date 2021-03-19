package workTask;

public class Controller {
	public static void main(String[] args) {
		System.out.println("checking the number is Odd or Evevn........");
		OddEvenNumber check= new OddEvenNumber();
		check.calculateNum();
	//-------------------------------------	
		System.out.println("\nnow initializing the 2 variables........");
		ComputerConsole  computer =new ComputerConsole();
		System.out.println("now calling the 3 methods........");
		computer.computerType();
	}
}
