package patterns.behavioralpatterns.strategtpattern;

import patterns.behavioralpatterns.strategtpattern.strategy.OperationAdd;
import patterns.behavioralpatterns.strategtpattern.strategy.OperationMultiply;
import patterns.behavioralpatterns.strategtpattern.strategy.OperationSubtract;

/**
 * 策略模式
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
