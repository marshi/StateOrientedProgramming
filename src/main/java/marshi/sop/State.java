package marshi.sop;

public abstract class State<M extends Message> {

    public State transit(M message) {
        State state = next(message);
        if (state == null) {
            return this;
        }
        return state.execute();
    }

    protected abstract State next(M event);

    protected abstract State execute();

}
