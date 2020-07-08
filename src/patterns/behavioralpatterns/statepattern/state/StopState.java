package patterns.behavioralpatterns.statepattern.state;

import patterns.behavioralpatterns.statepattern.Context;
import patterns.behavioralpatterns.statepattern.State;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
