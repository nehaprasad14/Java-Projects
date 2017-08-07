package gaspump.com.abstractFactory;

import gaspump.com.data.DataStore;
import gaspump.com.data.GP1_DataStore;
import gaspump.com.strategy.ACancelMsg;
import gaspump.com.strategy.ADisplayMenu;
import gaspump.com.strategy.AGasPumedMsg;
import gaspump.com.strategy.APayMsg;
import gaspump.com.strategy.APrintReceipt;
import gaspump.com.strategy.APumpGasUnit;
import gaspump.com.strategy.AReadyMsg;
import gaspump.com.strategy.ARejectMsg;
import gaspump.com.strategy.ASetInitialValues;
import gaspump.com.strategy.ASetPrice;
import gaspump.com.strategy.AStopMsg;
import gaspump.com.strategy.AStoreData;
import gaspump.com.strategy.GP1_DisplayMenu;
import gaspump.com.strategy.GP1_GasPumedMsg;
import gaspump.com.strategy.GP1_PayMsg;
import gaspump.com.strategy.GP1_PrintReceipt;
import gaspump.com.strategy.GP1_PumpGasUnit;
import gaspump.com.strategy.GP1_SetInitialValues;
import gaspump.com.strategy.GP1_SetPrice;
import gaspump.com.strategy.GP1_StoreData;
import gaspump.com.strategy.GP_CancelMsg;
import gaspump.com.strategy.GP_ReadyMsg;
import gaspump.com.strategy.GP_RejectMsg;
import gaspump.com.strategy.GP_StopMsg;

//************ Abstract Factory Pattern ************
//GasPump1 Concrete Factory Class
public class GP1_ClientFactory extends GasPumpFactory {

	public GP1_ClientFactory() {
		ds = new GP1_DataStore();
	}

	public DataStore getDataStore() {
		return ds;
	}

	public AStoreData getStoreData() {
		return new GP1_StoreData();
	}

	public APayMsg getPayMsg() {
		return new GP1_PayMsg();
	}

	public ADisplayMenu getDisplayMenu() {
		return new GP1_DisplayMenu();
	}

	public ARejectMsg getRejectMsg() {
		return new GP_RejectMsg();
	}

	public ACancelMsg getCancelMsg() {
		return new GP_CancelMsg();
	}

	public ASetPrice getSetPrice() {
		return new GP1_SetPrice();
	}

	public ASetInitialValues getSetInitialValues() {
		return new GP1_SetInitialValues();
	}

	public AReadyMsg getReadyMsg() {
		return new GP_ReadyMsg();
	}

	public APumpGasUnit getPumpGasUnit() {
		return new GP1_PumpGasUnit();
	}

	public AGasPumedMsg getGasPumpedMsg() {
		return new GP1_GasPumedMsg();
	}

	public AStopMsg getStopMsg() {
		return new GP_StopMsg();
	}

	public APrintReceipt getPrintReceipt() {
		return new GP1_PrintReceipt();
	}

}
