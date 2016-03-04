package com.example.martinbegleiter.testdagger2;

import dagger.Component;

/**
 * Created by martinbegleiter on 29/02/16.
 */
@Component(modules = {IntegerModule.class})
public interface GarageComponent {
    Garage createGarage();
}
