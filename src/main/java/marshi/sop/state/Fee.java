package marshi.sop.state;

import marshi.sop.State;
import marshi.sop.StateMachine;
import marshi.sop.StateMachine.Event;

import java.text.MessageFormat;

import static marshi.sop.StateMachine.Event.CRASH;
import static marshi.sop.StateMachine.Event._10;
import static marshi.sop.StateMachine.Event._100;
import static marshi.sop.StateMachine.Event._50;


public class Fee extends State {

    private final int fee;

    public Fee(int fee) {
        this.fee = fee;
    }

    @Override
    protected State next(Event event) {
        switch (event) {
            case CRASH:
                return new Crash();
            case _10:
                return new Fee(this.fee + 10);
            case _50:
                return new Fee(this.fee + 50);
            case _100:
                return new Fee(this.fee + 100);
            default:
                return this;
        }
    }

    @Override
    protected Fee execute() {
        if (120 < fee) {
            System.out.println(MessageFormat.format("コーラ買えました. 残り{0}円", this.fee - 120));
            return new Fee(fee - 120);
        } else {
            System.out.println(MessageFormat.format("現在{0}円. あと{1}円足りません", this.fee, 120 - fee));
            return this;
        }
    }

}
