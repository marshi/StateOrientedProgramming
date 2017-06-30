package marshi.sop;


public class StateMachine {

    private State current;

    public StateMachine(State initialState) {
        this.current = initialState;
    }

    public void transit(Event event) {
        current = current.transit(event);
    }

    public enum Event {

        _10, _50, _100,
        CRASH;

    }

}
