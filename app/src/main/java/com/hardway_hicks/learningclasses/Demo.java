package com.hardway_hicks.learningclasses;

/**
 * Created by Isz on 3/9/2017.
 */

public class Demo {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            VampireLord bob = new VampireLord("bob");
//            bob.showInfo();
//            while (bob.getLives() > 0) {
//                if (bob.dodges()) {
//                    continue;
//                }
//                if (bob.runAway()) {
//                    System.out.println("Bob ran away");
//                    break;
//                } else {
//                    bob.takeDamage(10);
//                }
//            }
//        }
        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 4));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 4));
        conan.showInventory();


        System.out.println(conan.score());
        conan.dropLoot("Cursed Shield");
        System.out.println(conan.score());

    }

}
