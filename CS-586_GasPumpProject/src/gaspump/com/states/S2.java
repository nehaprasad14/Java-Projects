package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
//State Class for S2 state

public class S2 extends GasStates {

	OutputProcessor op;

	public S2(OutputProcessor op) {
		super(op);
		this.op = op;
	}

	public void Approved(MDA_EFSM m) {
		op.DisplayMenu();
		m.ChangeState(new S3(op)); // point to S3
	}

	public void Reject(MDA_EFSM m) {
		op.RejectMsg();
		m.ChangeState(new S0(op)); // point to S0
	}

}
