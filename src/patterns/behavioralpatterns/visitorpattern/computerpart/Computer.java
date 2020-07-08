package patterns.behavioralpatterns.visitorpattern.computerpart;

import patterns.behavioralpatterns.visitorpattern.ComputerPart;
import patterns.behavioralpatterns.visitorpattern.ComputerPartVisitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
