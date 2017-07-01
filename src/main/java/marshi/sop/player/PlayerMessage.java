package marshi.sop.player;

import marshi.sop.Message;

/**
 * Copyright: CYBER AGENT. INC
 */
public class PlayerMessage extends Message<PlayerStateMachine.Event, PlayerProperty> {
    public PlayerMessage(PlayerStateMachine.Event event, PlayerProperty properties) {
        super(event, properties);
    }
}
