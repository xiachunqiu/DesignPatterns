package patterns.j2eepatterns.businessdelegatepattern;

import patterns.j2eepatterns.businessdelegatepattern.businessservice.EJBService;
import patterns.j2eepatterns.businessdelegatepattern.businessservice.JMSService;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
