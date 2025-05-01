package org.example;

public class LimitOrder extends Order {
    private double limitPrice;

    public LimitOrder(int id, String symbol, double quantity, double limitPrice, StockExchange exchange) {
        super(id, symbol, quantity, exchange);
        this.limitPrice = limitPrice;
    }

    @Override
    public boolean execute() {
        double marketPrice = exchange.getPrice(symbol);
        if (marketPrice <= limitPrice) {
            boolean success = exchange.placeOrder(symbol, quantity, limitPrice);
            this.status = success ? OrderStatus.FILLED : OrderStatus.CANCELLED;
            return success;
        } else {
            this.status = OrderStatus.OPEN;
            return false;
        }
    }

    public double getLimitPrice() {
        return limitPrice;
    }
}
