package org.example;

public class OrderPart {
    private int partId;
    private double quantity;
    private double price;

    public OrderPart(int partId, double quantity, double price) {
        this.partId = partId;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public int getPartId() {
        return partId;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

