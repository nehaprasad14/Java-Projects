package gaspump.com.strategy;

import gaspump.com.data.DataStore;
//************ Strategy Pattern ************
//Concrete class

public class GP2_SetInitialValues extends ASetInitialValues {
	
	public void SetInitialValues(DataStore ds) {
		ds.setL(0);  // set L = 0;
		ds.setTotalCost(0);
	}

}
