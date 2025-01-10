package com.study.lol.dto;

public class AddItemInfoRequest {
    private static int idCounter;
    private int id;
    private String name;
    private int price;
    private double attack;
    private double health;

    public AddItemInfoRequest(String name, int price, double attack, double health){
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.health = health;
    }

    @Override
    public String toString() {
        return "AddItemRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }

    public int getId() {
        return id;
    }

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
}
