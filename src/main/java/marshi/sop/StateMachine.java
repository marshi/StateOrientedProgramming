package marshi.sop;

/**
 * Copyright: CYBER AGENT. INC
 */
public abstract class StateMachine<M extends Message>  {
    protected State<M> current;

    public StateMachine(State<M> initialState) {
        this.current = initialState;
    }

    public void transit(M message) {
        current = current.transit(message);
    }
}
