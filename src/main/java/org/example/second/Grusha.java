package org.example.second;

import org.springframework.stereotype.Component;
@Component
public class Grusha implements Fruit {
    @Override
    public String sort() {
        return "OchenVkusni";
    }
}
