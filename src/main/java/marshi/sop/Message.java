package marshi.sop;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Copyright: CYBER AGENT. INC
 */
@Getter
@AllArgsConstructor
public class Message<E extends Enum<E>, P> {

    private E event;

    private P properties;

}
