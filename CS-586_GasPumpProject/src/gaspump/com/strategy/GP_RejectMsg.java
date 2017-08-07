package gaspump.com.strategy;

//************ Strategy Pattern ************
//Concrete class for RejectMsg

public class GP_RejectMsg extends ARejectMsg {

	public void RejectMsg() {
		System.out.println("\n*********   Credit card rejected.   *********\n");
	}

}
