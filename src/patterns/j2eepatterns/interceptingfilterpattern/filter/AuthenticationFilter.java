package patterns.j2eepatterns.interceptingfilterpattern.filter;

import patterns.j2eepatterns.interceptingfilterpattern.Filter;

public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
