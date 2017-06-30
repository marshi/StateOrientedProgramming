import java.text.MessageFormat;

/**
 * Copyright: CYBER AGENT. INC
 */
public class Fee extends State{

    private final int fee;

    public Fee(int fee) {
        this.fee = fee;
    }

    @Override
    protected State next(Event event) {
        if (Event._10 == event) {
            return new Fee(this.fee + 10);
        } else if (Event._50 == event) {
            return new Fee(this.fee + 50);
        } else if (Event._100 == event) {
            return new Fee(this.fee + 100);
        }
        return this;
    }

    @Override
    protected Fee execute() {
        if (120 < fee) {
            System.out.println(MessageFormat.format("コーラ買えました. 残り{0}円", this.fee - 120));
            return new Fee(fee - 120);
        } else {
            System.out.println(MessageFormat.format("現在{0}円. あと{1}円足りません", this.fee, 120 - fee));
            return this;
        }
    }

}
