package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP2_PumpGasUnit extends APumpGasUnit {

	// Disposes unit of gas ,counts # of units disposed and calculate total
	// price
	public void PumpGasUnit(DataStore ds) {
		ds.setL(ds.getL() + 1);
		float cost = ds.getL() * ds.getPrice();
		ds.setTotalCost(cost);
	}

}
