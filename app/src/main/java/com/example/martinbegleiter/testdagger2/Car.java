package com.example.martinbegleiter.testdagger2;

import javax.inject.Inject;

/**
 * Created by martinbegleiter on 28/02/16.
 */
public class Car {

    private final Engine mEngine;
    private String mName;

    @Inject
    public Car(Engine engine){
        mEngine = engine;
    }

    public void accelerate(){
        mEngine.accelerate();
        Logger.log("Accelerating rpm = " + mEngine.getRpm());
    }

    public void brake() {
        mEngine.brake();
        Logger.log("Braking rpm = " + mEngine.getRpm());
    }

    public String getName() {
        return mName;
    }

    public void getRpm() {
        Logger.log("Getting rpm " + mEngine.getRpm());
    }
}
