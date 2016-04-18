package com.example.martinbegleiter.testdagger2;

import javax.inject.Inject;

/**
 * Created by martinbegleiter on 18/04/16.
 */
public class Zoo {

    private final Animal mAnimal;

    @Inject
    public Zoo(Animal animal) {
        mAnimal = animal;
    }

    public Animal getAnimal() {
        return mAnimal;
    }
}
