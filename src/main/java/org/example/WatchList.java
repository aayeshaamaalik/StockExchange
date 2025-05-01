package org.example;

import java.util.ArrayList;
import java.util.List;

public class WatchList {
    private String name;
    private List<Stock> stocks;

    public WatchList(String name) {
        this.name = name;
        this.stocks = new ArrayList<>();
    }

    // Get all stocks
    public List<Stock> getStocks() {
        return stocks;
    }

    // Add a stock
    public boolean addStock(Stock stock) {
        if (!stocks.contains(stock)) {
            return stocks.add(stock);
        }
        return false;
    }

    // Remove a stock
    public boolean removeStock(Stock stock) {
        return stocks.remove(stock);
    }

    // Rename the watchlist
    public boolean changeName(String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
