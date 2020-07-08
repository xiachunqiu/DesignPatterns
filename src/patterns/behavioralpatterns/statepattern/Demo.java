package patterns.behavioralpatterns.statepattern;

import patterns.behavioralpatterns.statepattern.state.StartState;
import patterns.behavioralpatterns.statepattern.state.StopState;

/**
 * 状态模式
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
