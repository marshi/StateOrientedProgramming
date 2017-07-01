package marshi.sop.vendingMachine.state;

import marshi.sop.State;
import marshi.sop.vendingMachine.VendingMessage;
import marshi.sop.vendingMachine.VendingStateMachine;
import marshi.sop.vendingMachine.VendingStateMachine.Event;

import java.text.MessageFormat;


public class Fee extends State<VendingMessage> {

    private final int fee;

    public Fee(int fee) {
        this.fee = fee;
    }

    @Override
    protected State next(VendingMessage message) {
        switch (message.getEvent()) {
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
