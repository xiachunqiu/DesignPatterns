package patterns.j2eepatterns.interceptingfilterpattern;

import patterns.j2eepatterns.interceptingfilterpattern.filter.AuthenticationFilter;
import patterns.j2eepatterns.interceptingfilterpattern.filter.DebugFilter;

/**
 * 拦截过滤器模式
 */
public class Demo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
