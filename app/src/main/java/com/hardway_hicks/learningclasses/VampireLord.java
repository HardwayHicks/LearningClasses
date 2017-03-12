package com.hardway_hicks.learningclasses;

import java.util.Random;

/**
 * Created by Isz on 3/10/2017.
 */

public class VampireLord extends Vampire {
    @Override
    public void takeDamage(int damage) {
        super.takeDamage((damage * 2) / 4);
    }

    public VampireLord(String name) {
        super(name);
        setHitPoints(140);
        setLives(1);

    }

    public boolean runAway() {
        return (getHitPoints() <= 10);
    }

    public boolean dodges() {
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if (chance > 4) {
            System.out.println(getName() + " dodges");
            return true;
        }
        return false;
    }

}
