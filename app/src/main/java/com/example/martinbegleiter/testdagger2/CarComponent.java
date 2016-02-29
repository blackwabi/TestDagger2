package com.example.martinbegleiter.testdagger2;

/**
 * Created by martinbegleiter on 29/02/16.
 */

import dagger.Component;

@Component(modules = {CarModule.class, EngineModule.class})
public interface CarComponent {

    Car createCar();
}
