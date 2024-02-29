package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(IProximityCallback callback)
    {
        while (true) {
            if (isClose()) {
                callback.proximityCallback();
                break;
            }
        }
    }

    private boolean isClose()
    {
        return new Random().nextBoolean();
    }
}
