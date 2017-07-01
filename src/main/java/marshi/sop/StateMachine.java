package marshi.sop;

/**
 * Copyright: CYBER AGENT. INC
 */
public abstract class StateMachine {
    protected State current;

    public StateMachine(State initialState) {
        this.current = initialState;
    }

    public void transit(Message message) {
        current = current.transit(message);
    }
}
