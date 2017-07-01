package marshi.sop.vendingMachine;

import marshi.sop.Message;

public class VendingMessage extends Message<VendingStateMachine.Event, VendingProperty> {
    public VendingMessage(VendingStateMachine.Event event, VendingProperty properties) {
        super(event, properties);
    }

    public VendingMessage(VendingStateMachine.Event event) {
        super(event);
    }
}
