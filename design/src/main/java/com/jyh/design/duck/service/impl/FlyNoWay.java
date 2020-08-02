package com.jyh.design.duck.service.impl;

import com.jyh.design.duck.service.FlyBehavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm not fly!");
    }
}
