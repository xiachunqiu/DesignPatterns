package patterns.j2eepatterns.businessdelegatepattern.businessservice;

import patterns.j2eepatterns.businessdelegatepattern.BusinessService;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
