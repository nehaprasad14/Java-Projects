package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
//State Class for S3 state

public class S3 extends GasStates {

	OutputProcessor op;

	public S3(OutputProcessor op) {
		super(op);
		this.op = op;
	}

	public void SelectGas(int g, MDA_EFSM m) {
		op.SetPrice(g);
		m.ChangeState(new S4(op)); // point to S4
	}

	public void Cancel(MDA_EFSM m) {
		op.CancelMsg();
		m.ChangeState(new S0(op)); // point to S0
	}

}
