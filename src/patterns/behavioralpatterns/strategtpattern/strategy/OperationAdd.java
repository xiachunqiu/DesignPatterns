package patterns.behavioralpatterns.strategtpattern.strategy;

import patterns.behavioralpatterns.strategtpattern.Strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
