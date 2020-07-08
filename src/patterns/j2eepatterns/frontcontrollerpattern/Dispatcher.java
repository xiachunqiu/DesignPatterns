package patterns.j2eepatterns.frontcontrollerpattern;

import patterns.j2eepatterns.frontcontrollerpattern.view.HomeView;
import patterns.j2eepatterns.frontcontrollerpattern.view.StudentView;

public class Dispatcher {
    private final StudentView studentView;
    private final HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
