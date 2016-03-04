package com.example.martinbegleiter.testdagger2;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by martinbegleiter on 28/02/16.
 */
public class Engine {
    private static final int RPM_INCREASE = 10;
    private final Context mContext;
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
    public Engine(int baseRpm, Context context) {
        mRpm = baseRpm;
        mContext = context;
    }
}
