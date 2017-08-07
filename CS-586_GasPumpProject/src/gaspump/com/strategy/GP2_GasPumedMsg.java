package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP2_GasPumedMsg extends AGasPumedMsg {

	public void GasPumpedMsg(DataStore ds) {
		System.out.println(">> Pumped " + ds.getL() + " liter(s) of gas. << \n");
	}

}
