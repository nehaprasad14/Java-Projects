package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
//State Class for Start state
public class Start extends GasStates {

	OutputProcessor op;

	public Start(OutputProcessor op) {
		super(op);
		this.op = op;
	}

	public void Activate(MDA_EFSM m) {
		op.StoreData();
		m.ChangeState(new S0(op)); // point to S0
	}

}
