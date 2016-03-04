package com.example.martinbegleiter.testdagger2;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by martinbegleiter on 29/02/16.
 */
@Module
public class IntegerModule {

    private final Context mContext;

    public IntegerModule(Context applicationContext) {
        mContext = applicationContext;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }

    @Provides
    Integer provideInt() {
        return new Integer(380);
    }
}
