package patterns.behavioralpatterns.commandpattern;

import patterns.behavioralpatterns.commandpattern.order.BuyStock;
import patterns.behavioralpatterns.commandpattern.order.SellStock;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式
 */
public class Demo {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        Stock potatoStock = new Stock();
        potatoStock.setName("Potato");
        potatoStock.setQuantity(6);
        BuyStock buyStockOrder = new BuyStock(potatoStock);
        orderList.add(buyStockOrder);

        Stock tomatoStock = new Stock();
        tomatoStock.setName("Tomato");
        tomatoStock.setQuantity(8);
        SellStock sellStockOrder = new SellStock(tomatoStock);
        orderList.add(sellStockOrder);

        Broker broker = new Broker();
        orderList.forEach(broker::takeOrder);
        broker.placeOrders();
    }
}
