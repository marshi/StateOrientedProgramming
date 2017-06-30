
public class Application {

    public static void main(String[] args) {
        Fee fee = new Fee(0);
        StateMachine stateMachine = new StateMachine(fee);
        stateMachine.transit(Event._10);
        stateMachine.transit(Event._10);
        stateMachine.transit(Event._10);
        stateMachine.transit(Event._50);
        stateMachine.transit(Event._100);
        stateMachine.transit(Event._50);
        stateMachine.transit(Event._100);
        stateMachine.transit(Event._100);
    }

}
