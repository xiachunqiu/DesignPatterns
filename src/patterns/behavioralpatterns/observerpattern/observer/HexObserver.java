package patterns.behavioralpatterns.observerpattern.observer;

import patterns.behavioralpatterns.observerpattern.Observer;
import patterns.behavioralpatterns.observerpattern.Subject;

public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
