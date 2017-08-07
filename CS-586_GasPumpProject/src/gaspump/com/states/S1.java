package gaspump.com.states;

import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;

//************ State Pattern ************
//State Class for S1 state

public class S1 extends GasStates {

	OutputProcessor op;

	public S1(OutputProcessor op) {
		super(op);
		this.op = op;
	}

	public void Pay(int t, MDA_EFSM m) {
		
		if (t == 1) {
			System.out.println("\n*********   Waiting for Card status   *********\n");
			m.ChangeState(new S2(op)); // point to S2
		} else if (t == 2) {
			op.StoreCash();
			op.DisplayMenu();
			m.ChangeState(new S3(op)); // point to S3
		}
	}

}
