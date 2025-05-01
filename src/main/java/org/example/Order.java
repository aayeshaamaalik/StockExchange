package org.example;

import java.util.Date;

public abstract class Order {
    protected int id;
    protected String symbol;
    protected double quantity;
    protected Date orderDate;
    protected OrderStatus status;
    protected StockExchange exchange;

    public Order(int id, String symbol, double quantity, StockExchange exchange) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.orderDate = new Date();
        this.status = OrderStatus.OPEN;
        this.exchange = exchange;
    }

    public abstract boolean execute();

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getQuantity() {
        return quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}

