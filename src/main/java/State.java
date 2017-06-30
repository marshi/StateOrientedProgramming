import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Copyright: CYBER AGENT. INC
 */
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
