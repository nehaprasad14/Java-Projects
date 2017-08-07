package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
//State Class for S5 state

public class S5 extends GasStates {

	OutputProcessor op;

	public S5(OutputProcessor op) {
		super(op);
		this.op = op;
	}

	public void Pump(MDA_EFSM m) {
		op.PumpGasUnit();
		op.GasPumpedMsg();
		// No state change
	}

	public void StopPump(MDA_EFSM m) {
		op.StopMsg();
		m.ChangeState(new S6(op)); // point to S6
	}

}
