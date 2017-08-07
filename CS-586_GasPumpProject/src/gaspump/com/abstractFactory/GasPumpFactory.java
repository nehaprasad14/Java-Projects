package gaspump.com.abstractFactory;

import gaspump.com.data.DataStore;
import gaspump.com.strategy.ACancelMsg;
import gaspump.com.strategy.ADisplayMenu;
import gaspump.com.strategy.AGasPumedMsg;
import gaspump.com.strategy.APayMsg;
import gaspump.com.strategy.APrintReceipt;
import gaspump.com.strategy.APumpGasUnit;
import gaspump.com.strategy.AReadyMsg;
import gaspump.com.strategy.ARejectMsg;
import gaspump.com.strategy.AReturnCash;
import gaspump.com.strategy.ASetInitialValues;
import gaspump.com.strategy.ASetPrice;
import gaspump.com.strategy.AStopMsg;
import gaspump.com.strategy.AStoreCash;
import gaspump.com.strategy.AStoreData;

//************ Abstract Factory Pattern ************
// GasPump Abstract Factory Class
public abstract class GasPumpFactory {

	DataStore ds;

	public DataStore getDataStore() {
		return null;
	}

	public AStoreData getStoreData() {
		return null;
	}

	public APayMsg getPayMsg() {
		return null;
	}

	public ADisplayMenu getDisplayMenu() {
		return null;
	}

	public ACancelMsg getCancelMsg() {
		return null;
	}

	public ASetPrice getSetPrice() {
		return null;
	}

	public ASetInitialValues getSetInitialValues() {
		return null;
	}

	public AReadyMsg getReadyMsg() {
		return null;
	}

	public APumpGasUnit getPumpGasUnit() {
		return null;
	}

	public AGasPumedMsg getGasPumpedMsg() {
		return null;
	}

	public AStopMsg getStopMsg() {
		return null;
	}

	public APrintReceipt getPrintReceipt() {
		return null;
	}

	public AStoreCash getStoreCash() {
		return null;
	}

	public AReturnCash getReturnCash() {
		return null;
	}

	public ARejectMsg getRejectMsg() {
		return null;
	}
}
