package marshi.sop.vendingMachine;


import marshi.sop.State;
import marshi.sop.StateMachine;

public class VendingStateMachine extends StateMachine{

    public VendingStateMachine(State initialState) {
        super(initialState);
    }

    public enum Event {
        _10, _50, _100,
        CRASH;
    }

}
