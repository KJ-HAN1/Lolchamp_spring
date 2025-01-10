package com.study.lol.dto;

public class SkillsDTO {

    private String name;
    private double useMana;
    private double attackPoint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUseMana() {
        return useMana;
    }

    public void setUseMana(double useMana) {
        this.useMana = useMana;
    }

    public double getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(double attackPoint) {
        this.attackPoint = attackPoint;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "name='" + name + '\'' +
                ", useMana=" + useMana +
                ", attackPoint=" + attackPoint +
                '}';
    }
}
