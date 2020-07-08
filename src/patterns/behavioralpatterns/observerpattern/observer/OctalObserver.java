package patterns.behavioralpatterns.observerpattern.observer;

import patterns.behavioralpatterns.observerpattern.Observer;
import patterns.behavioralpatterns.observerpattern.Subject;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
