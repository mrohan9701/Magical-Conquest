package com.magicalarena;

import java.util.Random;

public class Dice {
    // Number of sides on the dice
    private static final int SIDES = 6;
    // Random number generator
    private Random random;

    // Constructor to initialize random number generator
    public Dice() {
        this.random = new Random();
    }

    // Roll the dice and return the result
    public int roll() {
        return random.nextInt(SIDES) + 1;
    }
}
