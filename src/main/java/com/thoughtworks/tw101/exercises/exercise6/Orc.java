package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by fayecheng on 4/4/17.
 */
public class Orc implements Monster {

    int hitpoints = 20;

    @Override
    public void takeDamage(int amount) {
        hitpoints = hitpoints - amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("Orc " + hitpoints + "HP");
    }
}
