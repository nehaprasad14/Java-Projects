package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP1_PumpGasUnit extends APumpGasUnit {

	// Disposes unit of gas ,counts # of units disposed and calculate total
	// price
	public void PumpGasUnit(DataStore ds) {
		ds.setG(ds.getG() + 1);
		ds.setTotalCost(ds.getG() * ds.getPrice());
	}

}
