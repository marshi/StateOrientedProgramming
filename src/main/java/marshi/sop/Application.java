package marshi.sop;

import com.sun.media.jfxmedia.events.PlayerStateEvent;
import marshi.sop.player.PlayerStateMachine;
import marshi.sop.player.PlayerStateMachine.Event;
import marshi.sop.player.state.Stop;
import marshi.sop.vendingMachine.VendingStateMachine;
import marshi.sop.vendingMachine.state.Fee;

import static marshi.sop.player.PlayerStateMachine.Event.*;
import static marshi.sop.vendingMachine.VendingStateMachine.Event.CRASH;
import static marshi.sop.vendingMachine.VendingStateMachine.Event._10;
import static marshi.sop.vendingMachine.VendingStateMachine.Event._100;
import static marshi.sop.vendingMachine.VendingStateMachine.Event._50;

public class Application {

    public static void main(String[] args) {
        Fee fee = new Fee(0);
        VendingStateMachine vendingStateMachine = new VendingStateMachine(fee);
        vendingStateMachine.transit(_10);
        vendingStateMachine.transit(_10);
        vendingStateMachine.transit(_10);
        vendingStateMachine.transit(_50);
        vendingStateMachine.transit(CRASH);
        vendingStateMachine.transit(_100);
        vendingStateMachine.transit(_50);
        vendingStateMachine.transit(CRASH);
        vendingStateMachine.transit(_100);
        vendingStateMachine.transit(_100);

        Stop stop = new Stop();
        PlayerStateMachine playerStateMachine = new PlayerStateMachine(stop);
        playerStateMachine.transit(PLAY);
        playerStateMachine.transit(PLAY);
        playerStateMachine.transit(STOP);
        playerStateMachine.transit(PLAY);
        playerStateMachine.transit(STOP);
        playerStateMachine.transit(STOP);
    }

}
