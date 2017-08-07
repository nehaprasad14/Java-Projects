package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP2_StoreData extends AStoreData {
	
	public void StoreData(DataStore ds) {
		ds.setRegularGPrice2(ds.getTempRegularGPrice2());
		ds.setSuperGPrice2(ds.getTempSuperGPrice2());
		ds.setPremiumGPrice2(ds.getTempPremiumGPrice2());
	}

}
