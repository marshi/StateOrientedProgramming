package marshi.sop;

import com.sun.media.jfxmedia.events.PlayerStateEvent;
import marshi.sop.player.PlayerMessage;
import marshi.sop.player.PlayerStateMachine;
import marshi.sop.player.PlayerStateMachine.Event;
import marshi.sop.player.state.Stop;
import marshi.sop.vendingMachine.VendingMessage;
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
        VendingMessage message_10 = new VendingMessage(_10, null);
        VendingMessage message_50 = new VendingMessage(_50, null);
        VendingMessage message_100 = new VendingMessage(_100, null);
        VendingMessage message_crash = new VendingMessage(CRASH, null);
        vendingStateMachine.transit(message_10);
        vendingStateMachine.transit(message_10);
        vendingStateMachine.transit(message_10);
        vendingStateMachine.transit(message_50);
        vendingStateMachine.transit(message_crash);
        vendingStateMachine.transit(message_100);
        vendingStateMachine.transit(message_50);
        vendingStateMachine.transit(message_crash);
        vendingStateMachine.transit(message_100);
        vendingStateMachine.transit(message_100);

        Stop stop = new Stop();
        PlayerStateMachine playerStateMachine = new PlayerStateMachine(stop);
        PlayerMessage playerMessage_play = new PlayerMessage(PLAY, null);
        PlayerMessage playerMessage_stop = new PlayerMessage(STOP, null);
        playerStateMachine.transit(playerMessage_play);
        playerStateMachine.transit(playerMessage_play);
        playerStateMachine.transit(playerMessage_stop);
        playerStateMachine.transit(playerMessage_play);
        playerStateMachine.transit(playerMessage_stop);
        playerStateMachine.transit(playerMessage_stop);
    }

}
