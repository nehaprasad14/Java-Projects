package gaspump.com.action;

import gaspump.com.abstractFactory.GasPumpFactory;
import gaspump.com.data.DataStore;
import gaspump.com.strategy.*;

//************ Strategy Pattern ************
// OutputProcessor Class (Actions)
public class OutputProcessor {

	DataStore ds;
	GasPumpFactory gf;
	AStoreData a1;
	APayMsg a2;
	AStoreCash a3;
	ADisplayMenu a4;
	ARejectMsg a5;
	ACancelMsg a6;
	ASetPrice a7;
	ASetInitialValues a8;
	AReadyMsg a9;
	APumpGasUnit a10;
	AGasPumedMsg a11;
	AStopMsg a12;
	APrintReceipt a13;
	AReturnCash a14;

	public OutputProcessor(GasPumpFactory gf) {
		this.gf = gf;
		initialize(gf);
	}

	public void initialize(GasPumpFactory gf) {
		ds = gf.getDataStore();
		a1 = gf.getStoreData();
		a2 = gf.getPayMsg();
		a3 = gf.getStoreCash();
		a4 = gf.getDisplayMenu();
		a5 = gf.getRejectMsg();
		a6 = gf.getCancelMsg();
		a7 = gf.getSetPrice();
		a8 = gf.getSetInitialValues();
		a9 = gf.getReadyMsg();
		a10 = gf.getPumpGasUnit();
		a11 = gf.getGasPumpedMsg();
		a12 = gf.getStopMsg();
		a13 = gf.getPrintReceipt();
		a14 = gf.getReturnCash();

	}

	public void StoreData() {
		a1.StoreData(ds);

	}

	public void PayMsg() {
		a2.PayMsg();
	}

	public void StoreCash() {
		a3.StoreCash(ds);
	}

	public void DisplayMenu() {
		a4.DisplayMenu();
	}

	public void RejectMsg() {
		a5.RejectMsg();
	}

	public void CancelMsg() {
		a6.CancelMsg();
	}

	public void SetPrice(int g) {
		a7.SetPrice(g, ds);
	}

	public void SetInitialValues() {
		a8.SetInitialValues(ds);
	}

	public void ReadyMsg() {
		a9.ReadyMsg();
	}

	public void PumpGasUnit() {
		a10.PumpGasUnit(ds);
	}

	public void GasPumpedMsg() {
		a11.GasPumpedMsg(ds);
	}

	public void StopMsg() {
		a12.StopMsg();
	}

	public void PrintReceipt() {
		a13.PrintReceipt(ds);
	}

	public void ReturnCash() {
		a14.ReturnCash(ds);
	}

}
