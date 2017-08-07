package gaspump.com.strategy;

//************ Strategy Pattern ************
//Concrete class for ReadyMsg

public class GP_ReadyMsg extends AReadyMsg {

	public void ReadyMsg() {
		System.out.println("\n*********   GasPump is ready for pumping.   *********\n");
	}

}
