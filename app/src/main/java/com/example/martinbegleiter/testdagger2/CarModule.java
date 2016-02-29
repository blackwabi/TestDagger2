package com.example.martinbegleiter.testdagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by martinbegleiter on 29/02/16.
 */
@Module
public class CarModule {

    @Provides
    Car provideCar(Engine engine) {
        return new Car(engine);
    }
}
