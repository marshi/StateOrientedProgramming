import java.util.Set;


public class StateMachine {

    private State current;

    public StateMachine(State initialState) {
        this.current = initialState;
    }

    public void transit(Event event) {
        current = current.transit(event);
    }

}
