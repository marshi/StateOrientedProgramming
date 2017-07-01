package marshi.sop.player.state;

import marshi.sop.Message;
import marshi.sop.State;
import marshi.sop.player.PlayerMessage;
import marshi.sop.player.PlayerStateMachine;
import marshi.sop.player.PlayerStateMachine.Event;

import static marshi.sop.player.PlayerStateMachine.Event.PLAY;

/**
 * Copyright: CYBER AGENT. INC
 */
public class Playing extends State<PlayerMessage> {

    @Override
    protected State next(PlayerMessage message) {
        switch(message.getEvent()) {
            case PLAY:
                return new Playing();
            case STOP:
                return new Stop();
            default:
                return this;
        }
    }

    @Override
    protected State execute() {
        System.out.println("再生中");
        return this;
    }

}
