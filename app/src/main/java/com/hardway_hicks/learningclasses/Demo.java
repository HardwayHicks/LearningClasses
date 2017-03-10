package com.hardway_hicks.learningclasses;

/**
 * Created by Isz on 3/9/2017.
 */

public class Demo {

    public static void main(String[] args) {
        Player tim = new Player();
        tim.setNameAndLevel("Blarg", 7);
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());
        System.out.println(tim.getWeapon().getName());

        Weapon newAxe = new Weapon("Derp Breaker", 20,20);
        tim.setWeapon(newAxe);
        System.out.println(tim.getWeapon().getName());
    }
}
