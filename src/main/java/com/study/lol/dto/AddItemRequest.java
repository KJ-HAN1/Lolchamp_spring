package com.study.lol.dto;

public class AddItemRequest {
    private String name;
    private int price;
    private double attack;
    private double health;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getAttack() {
        return attack;
    }

    public double getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "AddItemRequest{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }
}
