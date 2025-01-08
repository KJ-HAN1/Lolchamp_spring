package com.study.lol.dto;

public class AddSkillsRequest {
    String name;
    double useMana;
    double attackPoint;

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
