package com.study.lol.dto;

import java.util.List;

public class AddCharacterRequest {
    static int idCounter;
    int id;
    String name;
    double health;
    double attack;
    double mana;
    List<Skills> skiilSetList;

    // id++
    public AddCharacterRequest(String name, double health, double attack, double mana, List<Skills> skiilSetList) {
        this.id = ++idCounter;  // id 증가
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.mana = mana;
        this.skiilSetList = skiilSetList;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getAttack() {
        return attack;
    }

    public double getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "AddCharacterRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", mana=" + mana +
                ", skiilSetList=" + skiilSetList +
                '}';
    }
}
