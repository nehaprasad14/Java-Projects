package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP1_SetInitialValues extends ASetInitialValues{
	
	public void SetInitialValues(DataStore ds) {
		ds.setG(0);  // set G = 0;
		ds.setTotalCost(0); 
	}

}
