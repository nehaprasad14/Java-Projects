package gaspump.com.abstractFactory;

import gaspump.com.data.DataStore;
import gaspump.com.data.GP2_DataStore;
import gaspump.com.strategy.ACancelMsg;
import gaspump.com.strategy.ADisplayMenu;
import gaspump.com.strategy.AGasPumedMsg;
import gaspump.com.strategy.APayMsg;
import gaspump.com.strategy.APrintReceipt;
import gaspump.com.strategy.APumpGasUnit;
import gaspump.com.strategy.AReadyMsg;
import gaspump.com.strategy.AReturnCash;
import gaspump.com.strategy.ASetInitialValues;
import gaspump.com.strategy.ASetPrice;
import gaspump.com.strategy.AStopMsg;
import gaspump.com.strategy.AStoreCash;
import gaspump.com.strategy.AStoreData;
import gaspump.com.strategy.GP2_DisplayMenu;
import gaspump.com.strategy.GP2_GasPumedMsg;
import gaspump.com.strategy.GP2_PayMsg;
import gaspump.com.strategy.GP2_PrintReceipt;
import gaspump.com.strategy.GP2_PumpGasUnit;
import gaspump.com.strategy.GP2_ReturnCash;
import gaspump.com.strategy.GP2_SetInitialValues;
import gaspump.com.strategy.GP2_SetPrice;
import gaspump.com.strategy.GP2_StoreCash;
import gaspump.com.strategy.GP2_StoreData;
import gaspump.com.strategy.GP_CancelMsg;
import gaspump.com.strategy.GP_ReadyMsg;
import gaspump.com.strategy.GP_StopMsg;

//************ Abstract Factory Pattern ************
//GasPump2 Concrete Factory Class
public class GP2_ClientFactory extends GasPumpFactory {

	public GP2_ClientFactory() {
		ds = new GP2_DataStore();
	}

	public DataStore getDataStore() {
		return ds;
	}

	public AStoreData getStoreData() {
		return new GP2_StoreData();
	}

	public APayMsg getPayMsg() {
		return new GP2_PayMsg();
	}

	public ADisplayMenu getDisplayMenu() {
		return new GP2_DisplayMenu();
	}

	public ACancelMsg getCancelMsg() {
		return new GP_CancelMsg();
	}

	public ASetPrice getSetPrice() {
		return new GP2_SetPrice();
	}

	public ASetInitialValues getSetInitialValues() {
		return new GP2_SetInitialValues();
	}

	public AReadyMsg getReadyMsg() {
		return new GP_ReadyMsg();
	}

	public APumpGasUnit getPumpGasUnit() {
		return new GP2_PumpGasUnit();
	}

	public AGasPumedMsg getGasPumpedMsg() {
		return new GP2_GasPumedMsg();
	}

	public AStopMsg getStopMsg() {
		return new GP_StopMsg();
	}

	public APrintReceipt getPrintReceipt() {
		return new GP2_PrintReceipt();
	}

	public AStoreCash getStoreCash() {
		return new GP2_StoreCash();
	}

	public AReturnCash getReturnCash() {
		return new GP2_ReturnCash();
	}

}
