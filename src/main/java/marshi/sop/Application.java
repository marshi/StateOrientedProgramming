package marshi.sop;

import marshi.sop.player.PlayerMessage;
import marshi.sop.player.PlayerStateMachine;
import marshi.sop.player.state.Stop;
import marshi.sop.vendingMachine.VendingMessage;
import marshi.sop.vendingMachine.VendingProperty;
import marshi.sop.vendingMachine.VendingStateMachine;
import marshi.sop.vendingMachine.state.Fee;

import static marshi.sop.player.PlayerStateMachine.Event.PLAY;
import static marshi.sop.player.PlayerStateMachine.Event.STOP;
import static marshi.sop.vendingMachine.VendingStateMachine.Event.COIN;
import static marshi.sop.vendingMachine.VendingStateMachine.Event.CRASH;

public class Application {

    public static void main(String[] args) {
        Fee fee = new Fee(0);
        VendingStateMachine vendingStateMachine = new VendingStateMachine(fee);
        VendingProperty properties_10 = new VendingProperty(10);
        VendingProperty properties_50 = new VendingProperty(50);
        VendingProperty properties_30 = new VendingProperty(30);
        VendingProperty properties_100 = new VendingProperty(100);
        VendingMessage message_10 = new VendingMessage(COIN, properties_10);
        VendingMessage message_50 = new VendingMessage(COIN, properties_50);
        VendingMessage message_30 = new VendingMessage(COIN, properties_30);
        VendingMessage message_100 = new VendingMessage(COIN, properties_100);
        VendingMessage message_crash = new VendingMessage(CRASH, null);
        vendingStateMachine.transit(message_10);
        vendingStateMachine.transit(message_10);
        vendingStateMachine.transit(message_10);
        vendingStateMachine.transit(message_50);
        vendingStateMachine.transit(message_crash);
        vendingStateMachine.transit(message_100);
        vendingStateMachine.transit(message_50);
        vendingStateMachine.transit(message_30);
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
