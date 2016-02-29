package com.example.martinbegleiter.testdagger2;

import javax.inject.Inject;

/**
 * Created by martinbegleiter on 29/02/16.
 */
public class Garage {

    private Car mCar;

    @Inject
    public Garage(Car car) {
        mCar = car;
    }

    public Car getCar() {
        return mCar;
    }
}
