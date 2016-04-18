package com.example.martinbegleiter.testdagger2;

import dagger.Component;

/**
 * Created by martinbegleiter on 18/04/16.
 */
@Component
public interface ZooComponent {
    Zoo createZoo();
}
