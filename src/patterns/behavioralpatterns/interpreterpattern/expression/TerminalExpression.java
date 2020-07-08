package patterns.behavioralpatterns.interpreterpattern.expression;

import patterns.behavioralpatterns.interpreterpattern.Expression;

public class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
