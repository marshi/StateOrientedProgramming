package marshi.sop.state;

import marshi.sop.State;
import marshi.sop.StateMachine;

/**
 * Copyright: CYBER AGENT. INC
 */
public class Crash extends State{

    @Override
    protected State next(StateMachine.Event event) {
        return new Fee(0);
    }

    @Override
    protected State execute() {
        System.out.println("crash!!");
        return new Fee(0);
    }
}
