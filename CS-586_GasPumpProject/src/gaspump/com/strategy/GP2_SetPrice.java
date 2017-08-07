package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP2_SetPrice extends ASetPrice {

	public void SetPrice(int g, DataStore ds) {
		if (g == 1) {
			ds.setPrice(ds.getSuperGPrice2()); // Super gas price
			System.out.println("Super Gas selected");
		} else if (g == 2) {
			ds.setPrice(ds.getRegularGPrice2()); // Regular gas price
			System.out.println("Regular Gas selected");
		} else if (g == 3) {
			ds.setPrice(ds.getPremiumGPrice2()); // Premium gas price
			System.out.println("Premium Gas selected");
		}

	}

}
