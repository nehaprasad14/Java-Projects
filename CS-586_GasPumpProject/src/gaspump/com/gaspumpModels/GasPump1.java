package gaspump.com.gaspumpModels;

import gaspump.com.abstractFactory.GasPumpFactory;
import gaspump.com.controller.MDA_EFSM;
import gaspump.com.data.DataStore;

//Input Processor of GasPump1

public class GasPump1 {

	MDA_EFSM m; // m : MDA-EFSM object
	DataStore ds; // ds : Data Store object for GP1
	GasPumpFactory gf; // Abstract factory for GasPump

	int superGas = 1;
	int regularGas = 2;

	public GasPump1(GasPumpFactory gf1, MDA_EFSM m1) {
		gf = gf1;
		ds = gf1.getDataStore();
		m = m1;
	}

	public void Activate(float a, float b) {
		if ((a > 0) && (b > 0)) {
			ds.setTempRegularGPrice1(a); // a is the price of the Regular gas
											// per
											// gallon
			ds.setTempSuperGPrice1(b); // b is the price of Super gas per gallon
			m.Activate(); // the gas pump is Activated
		}
	}

	public void Start() {
		m.Start(); // start the transaction
	}

	public void PayCredit() {
		m.Pay(1); // 1: pay for gas by a credit card
	}

	public void Reject() {
		m.Reject(); // credit card is rejected
	}

	public void Cancel() {
		m.Cancel(); // cancel the transaction
	}

	public void Approved() {
		m.Approved(); // credit card is approved
	}

	public void Super() {
		m.SelectGas(superGas); // 1: Super gas is selected
	}

	public void Regular() {
		m.SelectGas(regularGas); // 2: Regular gas is selected
	}

	public void StartPump() {
		m.StartPump(); // start pumping gas
	}

	public void PumpGallon() {
		m.Pump(); // one gallon of gas is disposed
	}

	public void StopPump() {
		m.StopPump(); // stop pumping gas
		m.Receipt(); // print receipt
	}

}
