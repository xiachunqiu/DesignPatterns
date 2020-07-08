package patterns.behavioralpatterns.visitorpattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
