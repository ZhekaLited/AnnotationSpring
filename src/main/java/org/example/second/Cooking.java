package org.example.second;

import java.util.ArrayList;
import java.util.List;

public class Cooking {
    private List<Fruit> fruitList = new ArrayList<>();


    public void setFruitList(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    public void Cooking() {
        for (Fruit fruit : fruitList) {
            System.out.println("My favorite fruit: " + fruit.sort() + fruit.date());
        }
    }
}
