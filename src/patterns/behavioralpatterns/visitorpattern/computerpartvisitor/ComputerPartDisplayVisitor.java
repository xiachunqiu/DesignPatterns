package patterns.behavioralpatterns.visitorpattern.computerpartvisitor;

import patterns.behavioralpatterns.visitorpattern.ComputerPartVisitor;
import patterns.behavioralpatterns.visitorpattern.computerpart.Computer;
import patterns.behavioralpatterns.visitorpattern.computerpart.Keyboard;
import patterns.behavioralpatterns.visitorpattern.computerpart.Monitor;
import patterns.behavioralpatterns.visitorpattern.computerpart.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
