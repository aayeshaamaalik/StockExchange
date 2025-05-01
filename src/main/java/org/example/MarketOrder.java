package org.example;

public class MarketOrder extends Order {

    public MarketOrder(int id, String symbol, double quantity, StockExchange exchange) {
        super(id, symbol, quantity, exchange);
    }

    @Override
    public boolean execute() {
        double price = exchange.getPrice(symbol);
        boolean success = exchange.placeOrder(symbol, quantity, price);

        if (success) {
            this.status = OrderStatus.FILLED;
            return true;
        } else {
            this.status = OrderStatus.CANCELLED;
            return false;
        }
    }
}

