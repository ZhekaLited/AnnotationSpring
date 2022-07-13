package org.example.second;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Fruit {
    private Apple() {

    }

    public static Apple getApple() {
        return new Apple();
    }

//    public void doMyInit() {
//        System.out.println("Doing my initialization method");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }

    @Override
    public String sort() {
        return "NuOchenVkusni";
    }
}
