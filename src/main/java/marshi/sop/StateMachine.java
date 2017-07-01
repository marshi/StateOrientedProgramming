package marshi.sop;

import marshi.sop.vendingMachine.VendingStateMachine;

/**
 * Copyright: CYBER AGENT. INC
 */
public abstract class StateMachine<E> {
    protected State current;

    public StateMachine(State initialState) {
        this.current = initialState;
    }

    public void transit(E event) {
        current = current.transit(event);
    }
}
