package gaspump.com.strategy;

//************ Strategy Pattern ************
//Concrete class

public class GP2_PayMsg extends APayMsg {

	public void PayMsg() {
		System.out.println("\n*********   Select Payment Method:   *********");
		System.out.println(">> Cash");
	}

}
