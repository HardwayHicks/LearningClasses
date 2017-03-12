package com.hardway_hicks.learningclasses;

/**
 * Created by Isz on 3/10/2017.
 */

public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage) {
        int remainingHitPoints = this.hitPoints - damage;
        if (remainingHitPoints > 0) {
            setHitPoints(remainingHitPoints);
            System.out.println(this.name + " took " + damage + " points of damage, " + remainingHitPoints + " remaining");
        } else {
            this.lives = this.lives - 1;
            if (lives > 0) {
                System.out.println("Life lost" + this.lives + " lives left");
            } else {
                System.out.println("hella dead");
            }
        }
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + "\n" +
                "Hps: " + this.hitPoints + "\n" +
                "Lives: " + this.lives);
    }

    //************************************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
