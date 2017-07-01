package marshi.sop.player.state;

import marshi.sop.State;
import marshi.sop.player.PlayerStateMachine;

/**
 * Copyright: CYBER AGENT. INC
 */
public class Stop extends State<PlayerStateMachine.Event> {

    @Override
    protected State next(PlayerStateMachine.Event event) {
        switch(event) {
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
