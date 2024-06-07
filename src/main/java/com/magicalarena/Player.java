package com.magicalarena;

public class Player {
    // Private fields for player attributes
    private int health;
    private int strength;
    private int attack;

    // Constructor to initialize player attributes
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getter for player health
    public int getHealth() {
        return health;
    }

    // Setter for player health
    public void setHealth(int health) {
        this.health = health;
    }

    // Getter for player strength
    public int getStrength() {
        return strength;
    }

    // Getter for player attack
    public int getAttack() {
        return attack;
    }

    // Check if player is still alive
    public boolean isAlive() {
        return health > 0;
    }
}
