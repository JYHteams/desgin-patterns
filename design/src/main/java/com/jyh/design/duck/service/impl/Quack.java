package com.jyh.design.duck.service.impl;

import com.jyh.design.duck.service.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
