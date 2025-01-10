package com.study.lol.dto;

import java.util.Arrays;
import java.util.List;

public class AddCharacterRequest {
    private static int idCounter;
    private int id;
    private String name;
    private double health;
    private double attack;
    private double mana;
    private List<SkillsDTO> skillSetList;
    private List<ItemDTO> itemSet;

    // id++
    public AddCharacterRequest(String name, double health, double attack, double mana, List<SkillsDTO> skillSetList, List<ItemDTO> itemSet) {
        this.id = ++idCounter;  // id 증가
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.mana = mana;
        this.skillSetList = skillSetList;
        this.itemSet = itemSet;
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

    public List<SkillsDTO> getSkillSetList() {
        return skillSetList;
    }

    public List<ItemDTO> getItemSet() {
        return itemSet;
    }

    @Override
    public String toString() {
        return "AddCharacterRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", mana=" + mana +
                ", skillSetList=" + skillSetList +
                ", itemSet=" + itemSet +
                '}';
    }
}
