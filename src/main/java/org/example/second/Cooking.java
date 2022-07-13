package org.example.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Cooking {

    private Apple apple;

    private Grusha grusha;
@Autowired
    public Cooking(Apple apple, Grusha grusha) {
        this.apple = apple;
        this.grusha = grusha;
    }

    public String EatCooking() {
    return "All Fruit: " + apple.sort();

    }


}
