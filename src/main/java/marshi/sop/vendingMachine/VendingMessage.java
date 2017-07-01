package marshi.sop.vendingMachine;

import marshi.sop.Message;

/**
 * Copyright: CYBER AGENT. INC
 */
public class VendingMessage extends Message<VendingStateMachine.Event, VendingProperty> {
    public VendingMessage(VendingStateMachine.Event event, VendingProperty properties) {
        super(event, properties);
    }
}
