package com.study.lol.dto;

public class AddSkillsRequest {
    private String name;
    private double useMana;
    private double attackPoint;

    public String getName() {
        return name;
    }

    public double getUseMana() {
        return useMana;
    }

    public double getAttackPoint() {
        return attackPoint;
    }

    @Override
    public String toString() {
        return "AddSkillsRequest{" +
                "name='" + name + '\'' +
                ", useMana=" + useMana +
                ", attackPoint=" + attackPoint +
                '}';
    }
}
