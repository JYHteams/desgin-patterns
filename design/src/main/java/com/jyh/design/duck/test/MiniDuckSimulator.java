package com.jyh.design.duck.test;

import com.jyh.design.duck.util.Duck;
import com.jyh.design.duck.util.MallardDuck;
import com.jyh.design.duck.util.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.peformFly();
        System.out.println("===================================");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.peformFly();
    }
}
