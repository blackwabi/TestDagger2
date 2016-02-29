package com.example.martinbegleiter.testdagger2;

import javax.inject.Inject;

/**
 * Created by martinbegleiter on 28/02/16.
 */
public class Engine {
    private static final int RPM_INCREASE = 10;
    private int mRpm;

    public int getRpm() {
        return mRpm;
    }

    public void accelerate() {
        mRpm += RPM_INCREASE;
    }

    public void brake() {
        mRpm -= RPM_INCREASE;
    }

    @Inject
    public Engine(int baseRpm) {
        mRpm = baseRpm;
    }
}
