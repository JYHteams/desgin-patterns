package com.jyh.design.duck.util;

import com.jyh.design.duck.service.impl.FlyNoWay;
import com.jyh.design.duck.service.impl.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭！");
    }
}
