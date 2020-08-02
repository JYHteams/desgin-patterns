package com.jyh.design.duck.util;

import com.jyh.design.duck.service.impl.FlyWithWings;
import com.jyh.design.duck.service.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
