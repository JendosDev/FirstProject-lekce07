package com.engeto.restaurant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Order {
    private int table;
    private LocalTime orderedTime;
    private Dish items;
    private String waiter;
    private LocalTime fulfilmentTime;
    private String notes;

    public Order(int tableNumber, LocalTime orderedTime, Dish items, String waiter, LocalTime fulfilmentTime, String notes) {
        this.table = tableNumber;
        this.orderedTime = orderedTime;
        this.items = items;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime;
        this.notes = notes;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public LocalTime getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(LocalTime orderedTime) {
        this.orderedTime = orderedTime;
    }

    public Dish getItems() {
        return items;
    }

    public void setItems(Dish items) {
        this.items = items;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public LocalTime getFulfilmentTime() {
        return fulfilmentTime;
    }

    public void setFulfilmentTime(LocalTime fulfilmentTime) {
        this.fulfilmentTime = fulfilmentTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
