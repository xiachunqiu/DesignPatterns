package patterns.behavioralpatterns.statepattern.state;

import patterns.behavioralpatterns.statepattern.Context;
import patterns.behavioralpatterns.statepattern.State;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
