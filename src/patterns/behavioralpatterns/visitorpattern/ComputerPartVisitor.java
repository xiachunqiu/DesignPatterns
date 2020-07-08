package patterns.behavioralpatterns.visitorpattern;

import patterns.behavioralpatterns.visitorpattern.computerpart.Computer;
import patterns.behavioralpatterns.visitorpattern.computerpart.Keyboard;
import patterns.behavioralpatterns.visitorpattern.computerpart.Monitor;
import patterns.behavioralpatterns.visitorpattern.computerpart.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
