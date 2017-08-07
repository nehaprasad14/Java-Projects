package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
//State Class for S6 state

public class S6 extends GasStates {

	OutputProcessor op;

	public S6(OutputProcessor op) {
		super(op);
		this.op = op;
	}

	public void Receipt(int t, MDA_EFSM m) {
		op.PrintReceipt();
		if (t == 2) {
			op.ReturnCash();
		}
		m.ChangeState(new S0(op)); // point to S0
	}

	public void NoReceipt(MDA_EFSM m) {
		op.ReturnCash();
		m.ChangeState(new S0(op)); // point to S0
	}

}
