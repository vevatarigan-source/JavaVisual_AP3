package com.unpri.charactermanager.model;

public class Character {
    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;

    // Constructor pertama untuk karakter baru
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        setLevel(level);
    }

    // Constructor kedua untuk data lengkap
    public Character(int id, String name, CharacterType type,
                     int level, int hitPoints, int attackPower) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public CharacterType getType() { return type; }
    public void setType(CharacterType type) { this.type = type; }

    public int getLevel() { return level; }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level harus minimal 1"
            );
        }

        this.level = level;
        this.hitPoints = 100 + level * 10;
        this.attackPower = level * 5;
    }

    public int getHitPoints() { return hitPoints; }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttackPower() { return attackPower; }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    public void levelUp() {
        setLevel(level + 1);
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                '}';
    }
}
