package patterns.behavioralpatterns.commandpattern.order;

import patterns.behavioralpatterns.commandpattern.Order;
import patterns.behavioralpatterns.commandpattern.Stock;

public class SellStock implements Order {
    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
