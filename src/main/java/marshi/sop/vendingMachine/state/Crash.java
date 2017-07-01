package marshi.sop.vendingMachine.state;

import marshi.sop.State;
import marshi.sop.vendingMachine.VendingStateMachine;

/**
 * Copyright: CYBER AGENT. INC
 */
public class Crash extends State<VendingStateMachine.Event>{

    @Override
    protected State next(VendingStateMachine.Event event) {
        return new Fee(0);
    }

    @Override
    protected State execute() {
        System.out.println("crash!!");
        return new Fee(0);
    }
}
