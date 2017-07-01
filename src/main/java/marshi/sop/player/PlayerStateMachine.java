package marshi.sop.player;

import marshi.sop.State;
import marshi.sop.StateMachine;

/**
 * Copyright: CYBER AGENT. INC
 */
public class PlayerStateMachine extends StateMachine<PlayerMessage> {

    public PlayerStateMachine(State<PlayerMessage> initialState) {
        super(initialState);
    }

    public enum Event {
        PLAY, STOP;
    }

}
