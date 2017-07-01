package marshi.sop;

public abstract class State<M extends Message> {

    public State<M> transit(M message) {
        State<M> state = next(message);
        if (state == null) {
            return this;
        }
        return state.execute();
    }

    protected abstract State<M> next(M message);

    protected abstract State<M> execute();

}
