package gaspump.com.strategy;

import gaspump.com.data.DataStore;

//************ Strategy Pattern ************
//Concrete class

public class GP1_PrintReceipt extends APrintReceipt {
	
	public void PrintReceipt(DataStore ds) {
		
		System.out.println("\n*********   RECEIPT   *********");
		System.out.println("No. of gallons: "+ ds.getG());
		System.out.println("Total amount: $"+ ds.getTotalCost());

	}

}
