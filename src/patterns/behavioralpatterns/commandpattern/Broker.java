package patterns.behavioralpatterns.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
