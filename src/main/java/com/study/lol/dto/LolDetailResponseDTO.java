package com.study.lol.dto;

import java.util.List;

public class LolDetailResponseDTO {

    private int id;
    private String name;
    private double health;
    private double attack;
    private double mana;
    private List<SkillsDTO> skillSet;
    private static List<ItemDTO> itemSet;
}
