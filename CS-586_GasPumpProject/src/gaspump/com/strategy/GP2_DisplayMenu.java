package gaspump.com.strategy;

//************ Strategy Pattern ************
//Concrete class

public class GP2_DisplayMenu extends ADisplayMenu {

	public void DisplayMenu() {
		
		System.out.println("Please select Gas type from below menu:");
		System.out.println(">> Regular");
		System.out.println(">> Super");
		System.out.println(">> Premium");

	}

}
