package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP2_StoreCash extends AStoreCash {

	public void StoreCash(DataStore ds) {
		ds.setCash(ds.getTempCash());
	}

}
