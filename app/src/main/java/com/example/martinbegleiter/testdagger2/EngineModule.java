package com.example.martinbegleiter.testdagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by martinbegleiter on 29/02/16.
 */
@Module
public class EngineModule {

    @Provides
    Engine provideEngine() {
        return new Engine(300);
    }
}
