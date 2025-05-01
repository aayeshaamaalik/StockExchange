package org.example;

import java.util.HashMap;
import java.util.Map;

public class StockExchange {
    private Map<String, Double> stockPrices;

    public StockExchange() {
        this.stockPrices = new HashMap<>();
    }

    // Set or update price of a stock
    public void setPrice(String symbol, double price) {
        stockPrices.put(symbol, price);
    }

    // Get current market price of a stock
    public double getPrice(String symbol) {
        return stockPrices.getOrDefault(symbol, 0.0);
    }

    // Simulate placing an order
    public boolean placeOrder(String symbol, double quantity, double price) {
        // Placeholder: assume order is always successful
        System.out.println("Executed order for " + quantity + " shares of " + symbol + " at $" + price);
        return true;
    }
}

