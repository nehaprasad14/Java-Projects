package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
//State Class for S0 state

public class S0 extends GasStates {

	OutputProcessor op;

	public S0(OutputProcessor op) {
		super(op);
		this.op = op;
	}

	public void Start(MDA_EFSM m) {
		op.PayMsg();
		m.ChangeState(new S1(op)); // point to S1
	}

}
