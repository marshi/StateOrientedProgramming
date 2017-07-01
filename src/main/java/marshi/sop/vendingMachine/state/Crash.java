package marshi.sop.vendingMachine.state;

import marshi.sop.State;
import marshi.sop.vendingMachine.VendingMessage;

public class Crash extends State<VendingMessage>{

    @Override
    protected State<VendingMessage> next(VendingMessage message) {
        return new Fee(0);
    }

    @Override
    protected State<VendingMessage> execute() {
        System.out.println("crash!!");
        return new Fee(0);
    }
}
