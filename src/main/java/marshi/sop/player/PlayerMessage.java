package marshi.sop.player;

import marshi.sop.Message;

public class PlayerMessage extends Message<PlayerStateMachine.Event, PlayerProperty> {
    public PlayerMessage(PlayerStateMachine.Event event, PlayerProperty properties) {
        super(event, properties);
    }
}
