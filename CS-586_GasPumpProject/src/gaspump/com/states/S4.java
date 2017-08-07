package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
//State Class for S4 state

public class S4 extends GasStates {

	OutputProcessor op;

	public S4(OutputProcessor op) {
		super(op);
		this.op = op;
	}

	public void StartPump(MDA_EFSM m) {
		op.SetInitialValues();
		op.ReadyMsg();
		m.ChangeState(new S5(op)); // point to S5
	}

}
