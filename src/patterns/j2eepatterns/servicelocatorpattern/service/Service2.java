package patterns.j2eepatterns.servicelocatorpattern.service;

import patterns.j2eepatterns.servicelocatorpattern.Service;

public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
