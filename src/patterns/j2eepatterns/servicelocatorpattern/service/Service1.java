package patterns.j2eepatterns.servicelocatorpattern.service;

import patterns.j2eepatterns.servicelocatorpattern.Service;

public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
