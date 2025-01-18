package com.study.lol.dto;

import com.study.lol.entity.LolCharacterEntity;

import java.util.List;

public class LolCharacterDTO {
    private long id;
    private String name;
    private double health;
    private double attack;
    private double mana;
    private List<SkillsDTO> skillSet;
    private static List<ItemDTO> itemSet;

    public LolCharacterDTO(){}
    LolCharacterDTO(long id){
        this.id = id;
    }

    public long getId() {
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

    public List<SkillsDTO> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(List<SkillsDTO> skillSet) {
        this.skillSet = skillSet;
    }

    public static void setItemSet(List<ItemDTO> itemSet) {
        LolCharacterDTO.itemSet = itemSet;
    }

    public static LolCharacterDTO parseDto (LolCharacterEntity entity) {
        return new LolCharacterDTO(entity.getLol_character_seq());
    }
}
