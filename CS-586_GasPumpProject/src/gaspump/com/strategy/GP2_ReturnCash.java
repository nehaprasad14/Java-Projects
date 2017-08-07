package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP2_ReturnCash extends AReturnCash {

	public void ReturnCash(DataStore ds) {
		float r = ds.getCash() - ds.getTotalCost();
		System.out.println("Cash returned: $" + Math.abs(r));
	}

}
