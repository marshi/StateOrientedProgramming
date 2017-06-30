package marshi.sop;

import marshi.sop.StateMachine.Event;
import marshi.sop.state.Fee;

import static marshi.sop.StateMachine.Event.*;

public class Application {

    public static void main(String[] args) {
        Fee fee = new Fee(0);
        StateMachine stateMachine = new StateMachine(fee);
        stateMachine.transit(_10);
        stateMachine.transit(_10);
        stateMachine.transit(_10);
        stateMachine.transit(_50);
        stateMachine.transit(CRASH);
        stateMachine.transit(_100);
        stateMachine.transit(_50);
        stateMachine.transit(CRASH);
        stateMachine.transit(_100);
        stateMachine.transit(_100);
    }

}
