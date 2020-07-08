package patterns.behavioralpatterns.visitorpattern;

import patterns.behavioralpatterns.visitorpattern.computerpart.Computer;
import patterns.behavioralpatterns.visitorpattern.computerpartvisitor.ComputerPartDisplayVisitor;

/**
 * 访问者模式
 */
public class Demo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
