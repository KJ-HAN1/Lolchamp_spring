package com.study.lol.dto;

import java.util.List;

public class AddCharacterRequest {
    int id=0;
    String name;
    double health;
    double attack;
    double mana;
    List<Skills> skiilSetList;


    //new addcharacter id num++
    {
        ++id;
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
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", mana=" + mana +
                '}';
    }
}
