package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP1_GasPumedMsg extends AGasPumedMsg {

	public void GasPumpedMsg(DataStore ds) {
		System.out.println(">>  Pumped " + ds.getG() + " gallon(s) of gas. <<\n");
	}

}
