package gaspump.com.controller;

import gaspump.com.abstractFactory.GasPumpFactory;
import gaspump.com.action.OutputProcessor;
import gaspump.com.states.*;

//************ State Pattern ************
//MDA_EFSM Context Class (Events)
public class MDA_EFSM {

	GasStates gs; // Pointer for current gas state
	int t;

	public MDA_EFSM() {

	}

	public MDA_EFSM(GasPumpFactory gf, OutputProcessor op) {
		gs = new Start(op);// points to Start state
	}

	public void ChangeState(GasStates current) {
		gs = current;
	}

	// MDA - EFSM Events
	public void Activate() {
		gs.Activate(this);
	}

	public void Start() {
		gs.Start(this);
	}

	public void Pay(int t) {
		this.t = t;
		gs.Pay(t, this);
	}

	public void Reject() {
		gs.Reject(this);
	}

	public void Approved() {
		gs.Approved(this);
	}

	public void Cancel() {
		gs.Cancel(this);
	}

	public void SelectGas(int g) {
		gs.SelectGas(g, this);
	}

	public void StartPump() {
		gs.StartPump(this);
	}

	public void Pump() {
		gs.Pump(this);
	}

	public void StopPump() {
		gs.StopPump(this);
	}

	public void Receipt() {
		gs.Receipt(t, this);
	}

	public void NoReceipt() {
		gs.NoReceipt(this);
	}

}
