package marshi.sop;

import marshi.sop.StateMachine.Event;

public abstract class State {

    public State transit(Event event) {
        State state = next(event);
        if (state == null) {
            return this;
        }
        return state.execute();
    }

    protected abstract State next(Event event);

    protected abstract State execute();

}
