package patterns.behavioralpatterns.visitorpattern.computerpart;

import patterns.behavioralpatterns.visitorpattern.ComputerPart;
import patterns.behavioralpatterns.visitorpattern.ComputerPartVisitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
