package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by fayecheng on 4/4/17.
 */
public class Troll implements Monster {

    int hitpoints = 40;

    @Override
    public void takeDamage(int amount) {
        hitpoints = hitpoints - (amount/2);
    }

    @Override
    public void reportStatus() {
        System.out.println("Troll " + hitpoints + "HP");
    }
}
