package gaspump.com.strategy;

//************ Strategy Pattern ************
//Concrete class for CancelMsg

public class GP_CancelMsg extends ACancelMsg {

	public void CancelMsg() {

		System.out.println("\n*********   Transaction has been cancelled.   *********\n");

	}

}
