package marshi.sop.vendingMachine;


import marshi.sop.State;
import marshi.sop.StateMachine;

public class VendingStateMachine extends StateMachine<VendingMessage> {

    public VendingStateMachine(State<VendingMessage> initialState) {
        super(initialState);
    }

    public enum Event {
        COIN,
        CRASH;
    }

}
