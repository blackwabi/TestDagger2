package com.example.martinbegleiter.testdagger2;

import javax.inject.Inject;

/**
 * Created by martinbegleiter on 18/04/16.
 */
public class Animal {

    private final Keeper mKeeper;

    @Inject
    public Animal(Keeper keeper) {
        mKeeper = keeper;
    }

    public void run() {
        System.out.println("Animal running!");
    }

    public void makeNoise() {
        System.out.println("Animal making noise!");
    }
}
