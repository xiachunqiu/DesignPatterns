package patterns.j2eepatterns.interceptingfilterpattern.filter;

import patterns.j2eepatterns.interceptingfilterpattern.Filter;

public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
