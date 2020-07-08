package patterns.behavioralpatterns.nullobjectpattern;

import patterns.behavioralpatterns.nullobjectpattern.customer.NullCustomer;
import patterns.behavioralpatterns.nullobjectpattern.customer.RealCustomer;

public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
