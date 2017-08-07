package gaspump.com.strategy;

//************ Strategy Pattern ************
//Concrete class

public class GP1_PayMsg extends APayMsg {

	public void PayMsg() {
		
		System.out.println("\n*********   Select Payment Method:   *********");
		System.out.println(" >> Credit Card.");
	}

}
