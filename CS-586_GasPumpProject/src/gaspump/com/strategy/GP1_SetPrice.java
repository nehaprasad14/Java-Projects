package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP1_SetPrice extends ASetPrice {

	public void SetPrice(int g, DataStore ds) {
		if (g == 1) {
			ds.setPrice(ds.getSuperGPrice1()); // Super gas price
			System.out.println("Super Gas selected");
		} else if (g == 2) {
			ds.setPrice(ds.getRegularGPrice1()); // Regular gas price
			System.out.println("Regular Gas selected");
		}

	}

}
