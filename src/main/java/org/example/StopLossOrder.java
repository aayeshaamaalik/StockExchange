package org.example;

public class StopLossOrder extends Order {
    private double stopPrice;

    public StopLossOrder(int id, String symbol, double quantity, double stopPrice, StockExchange exchange) {
        super(id, symbol, quantity, exchange);
        this.stopPrice = stopPrice;
    }

    @Override
    public boolean execute() {
        double marketPrice = exchange.getPrice(symbol);
        if (marketPrice <= stopPrice) {
            boolean success = exchange.placeOrder(symbol, quantity, marketPrice);
            this.status = success ? OrderStatus.FILLED : OrderStatus.CANCELLED;
            return success;
        } else {
            this.status = OrderStatus.OPEN;
            return false;
        }
    }

    public double getStopPrice() {
        return stopPrice;
    }
}

