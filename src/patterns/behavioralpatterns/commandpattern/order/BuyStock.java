package patterns.behavioralpatterns.commandpattern.order;

import patterns.behavioralpatterns.commandpattern.Order;
import patterns.behavioralpatterns.commandpattern.Stock;

public class BuyStock implements Order {
    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
