package gaspump.com.gaspumpModels;

import gaspump.com.abstractFactory.GasPumpFactory;
import gaspump.com.controller.MDA_EFSM;
import gaspump.com.data.DataStore;

//Input Processor of GasPump2

public class GasPump2 {

	MDA_EFSM m; // m : MDA-EFSM object
	DataStore ds;// ds : Data Store object for GP1
	GasPumpFactory gf; // Abstract factory for GasPump

	int superGas = 1;
	int regularGas = 2;
	int premiumGas = 3;

	public GasPump2(GasPumpFactory gf2, MDA_EFSM m2) {
		gf = gf2;
		ds = gf2.getDataStore();
		m = m2;
	}

	public void Activate(int a, int b, int c) {
		if ((a > 0) && (b > 0) && (c > 0)) {
			ds.setTempRegularGPrice2(a); // a is the price of the Regular gas
											// per liter
			ds.setTempPremiumGPrice2(b); // b is the price of Premium gas per
											// liter
			ds.setTempSuperGPrice2(c); // c is the price of Super gas per liter
			m.Activate(); // the gas pump is activated
		}
	}

	public void Start() {
		m.Start(); // start the transaction
	}

	public void PayCash(int c) {
		if (c > 0) {
			ds.setTempCash(c); // c represents prepaid cash
			m.Pay(2); // 2: pay for gas by cash
		} else {

			System.out.println(">> Cash amount should be greater than 0. <<");
		}
	}

	public void Cancel() {
		m.Cancel(); // cancel the transaction
	}

	public void Super() {
		m.SelectGas(superGas); // 1: Super gas is selected
	}

	public void Regular() {
		m.SelectGas(regularGas); // 2: Regular gas is selected
	}

	public void Premium() {
		m.SelectGas(premiumGas); // 3: Premium gas is selected
	}

	public void StartPump() {
		m.StartPump(); // start pumping gas
	}

	public void PumpLiter() {
		if (ds.getCash() < ((ds.getL() + 1) * ds.getPrice())) { // one liter of
																// gas is
			// disposed
			System.out.println(">> Low Cash. <<");
			m.StopPump();
		} else {
			m.Pump();
		}
	}

	public void Stop() {
		m.StopPump(); // stop pumping gas
	}

	public void Receipt() {
		m.Receipt(); // Receipt is requested
	}

	public void NoReceipt() {
		m.NoReceipt(); // No receipt
	}

}
