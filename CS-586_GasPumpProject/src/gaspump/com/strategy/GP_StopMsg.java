package gaspump.com.strategy;

//************ Strategy Pattern ************
//Concrete class for StopMsg

public class GP_StopMsg extends AStopMsg{
	
	public void StopMsg() {
		System.out.println("\n*********   GasPump stopped.   *********\n");
	}
}
