package marshi.sop.vendingMachine.state;

import marshi.sop.State;
import marshi.sop.vendingMachine.VendingMessage;
import marshi.sop.vendingMachine.VendingStateMachine;

/**
 * Copyright: CYBER AGENT. INC
 */
public class Crash extends State<VendingMessage>{

    @Override
    protected State next(VendingMessage message) {
        return new Fee(0);
    }

    @Override
    protected State execute() {
        System.out.println("crash!!");
        return new Fee(0);
    }
}
