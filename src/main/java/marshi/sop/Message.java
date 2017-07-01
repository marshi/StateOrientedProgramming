package marshi.sop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Message<E extends Enum<E>, P> {

    private final E event;

    private P properties;

}
