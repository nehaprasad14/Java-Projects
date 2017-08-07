package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
// GasStates - Abstract Class
public abstract class GasStates {

	public GasStates(OutputProcessor op) {
	}

	// All methods are abstract
	public void Activate(MDA_EFSM m) {
	}

	public void Start(MDA_EFSM m) {
	}

	public void Pay(int t, MDA_EFSM m) {
	}

	public void Reject(MDA_EFSM m) {
	}

	public void Approved(MDA_EFSM m) {
	}

	public void Cancel(MDA_EFSM m) {
	}

	public void SelectGas(int g, MDA_EFSM m) {
	}

	public void StartPump(MDA_EFSM m) {
	}

	public void Pump(MDA_EFSM m) {
	}

	public void StopPump(MDA_EFSM m) {
	}

	public void Receipt(int t, MDA_EFSM m) {
	}

	public void NoReceipt(MDA_EFSM m) {
	}

}
