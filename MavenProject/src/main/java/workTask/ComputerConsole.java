package workTask;

public class ComputerConsole {
	
	String wires="connected";
	boolean isWorking= true;
	public void computerType() {
		System.out.println( " type of computer is Laptop");
		workingCondition();
		chargerCheck();
	}
	boolean workingCondition() {
		System.out.println("Working condition="+ isWorking);
		return isWorking;
	}
	String chargerCheck() {
		System.out.println("Charger is "+ wires);
		return wires;
	}
	
}
