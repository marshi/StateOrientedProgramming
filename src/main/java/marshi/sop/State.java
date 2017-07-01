package marshi.sop;

public abstract class State<E> {

    public State transit(E event) {
        State state = next(event);
        if (state == null) {
            return this;
        }
        return state.execute();
    }

    protected abstract State next(E event);

    protected abstract State execute();

}
