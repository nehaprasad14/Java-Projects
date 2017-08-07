package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP1_StoreData extends AStoreData {

	public void StoreData(DataStore ds) {
		ds.setRegularGPrice1(ds.getTempRegularGPrice1());
		ds.setSuperGPrice1(ds.getTempSuperGPrice1());
	}

}
