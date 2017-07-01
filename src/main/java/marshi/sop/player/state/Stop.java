package marshi.sop.player.state;

import marshi.sop.Message;
import marshi.sop.State;
import marshi.sop.player.PlayerMessage;
import marshi.sop.player.PlayerProperty;
import marshi.sop.player.PlayerStateMachine;

import static marshi.sop.player.PlayerStateMachine.Event.PLAY;
import static marshi.sop.player.PlayerStateMachine.Event.STOP;

/**
 * Copyright: CYBER AGENT. INC
 */
public class Stop extends State<PlayerMessage> {

    @Override
    protected State next(PlayerMessage event) {
        switch(event.getEvent()) {
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
        System.out.println("停止中");
        return this;
    }

}
