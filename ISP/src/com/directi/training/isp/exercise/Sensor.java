package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(IProximitySensibleObject object)
    {
        while (true) {
            if (isPersonClose()) {
                object.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}