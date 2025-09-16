package net.javaguide.basedomains.dto;

public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;

    // No-args constructor (important for frameworks like Spring, Jackson, Hibernate, etc.)
    public Order() {
    }

    // All-args constructor
    public Order(String orderId, String name, int qty, double price) {
        this.orderId = orderId;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    // Getter & Setter for orderId
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // Getter & Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for qty
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter & Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
