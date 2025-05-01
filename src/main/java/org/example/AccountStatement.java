package org.example;

import java.util.ArrayList;
import java.util.List;

public class AccountStatement {
    private List<Order> orders;
    private List<StockPosition> positions;

    public AccountStatement() {
        this.orders = new ArrayList<>();
        this.positions = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void updatePosition(String symbol, double quantity) {
        for (StockPosition position : positions) {
            if (position.getSymbol().equals(symbol)) {
                position.setQuantity(position.getQuantity() + quantity);
                return;
            }
        }
        positions.add(new StockPosition(symbol, quantity));
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<StockPosition> getPositions() {
        return positions;
    }
}

