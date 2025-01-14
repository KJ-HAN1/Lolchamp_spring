package com.study.lol.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="lol_character")
public class LolCharacterEntity {

    public LolCharacterEntity(){}

    public LolCharacterEntity(Long lol_character_seq, String name, Double health, Double mana, Double attackPoint, Double defencePoint, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.lol_character_seq = lol_character_seq;
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.attackPoint = attackPoint;
        this.defencePoint = defencePoint;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lol_character_seq;

    @Column(name = "name")
    private String name;

    @Column(name = "health")
    private Double health;

    @Column(name = "mana")
    private  Double mana;

    @Column(name = "attack_point")
    private  Double attackPoint;

    @Column(name = "defence_point")
    private  Double defencePoint;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getLol_character_seq() {
        return lol_character_seq;
    }

    public void setLol_character_seq(Long lol_character_seq) {
        this.lol_character_seq = lol_character_seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public Double getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(Double attackPoint) {
        this.attackPoint = attackPoint;
    }

    public Double getDefencePoint() {
        return defencePoint;
    }

    public void setDefencePoint(Double defencePoint) {
        this.defencePoint = defencePoint;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "LolCharacterEntity{" +
                "lol_character_seq=" + lol_character_seq +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", attackPoint=" + attackPoint +
                ", defencePoint=" + defencePoint +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
