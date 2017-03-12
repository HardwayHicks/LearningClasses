package com.hardway_hicks.learningclasses;

/**
 * Created by Isz on 3/10/2017.
 */

public class Vampire extends Enemy {
    public Vampire(String name) {
        super(name, 20, 3);

    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }
}
