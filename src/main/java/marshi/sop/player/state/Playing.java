package marshi.sop.player.state;

import marshi.sop.State;
import marshi.sop.player.PlayerMessage;

public class Playing extends State<PlayerMessage> {

    @Override
    protected State<PlayerMessage> next(PlayerMessage message) {
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
    protected State<PlayerMessage> execute() {
        System.out.println("再生中");
        return this;
    }

}
