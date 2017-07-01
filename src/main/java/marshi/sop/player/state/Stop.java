package marshi.sop.player.state;

import marshi.sop.State;
import marshi.sop.player.PlayerMessage;

public class Stop extends State<PlayerMessage> {

    @Override
    protected State<PlayerMessage> next(PlayerMessage event) {
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
    protected State<PlayerMessage> execute() {
        System.out.println("停止中");
        return this;
    }

}
