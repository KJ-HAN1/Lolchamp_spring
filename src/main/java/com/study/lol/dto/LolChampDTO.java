package com.study.lol.dto;

import java.util.List;

public class LolChampDTO {
    int id;
    String name;
    double health;
    double attack;
    double mana;
    List<Skills> skillset;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public List<Skills> getSkillset() {
        return skillset;
    }

    public void setSkillset(List<Skills> skillset) {
        this.skillset = skillset;
    }
}
