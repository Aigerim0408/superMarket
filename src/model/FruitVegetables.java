package model;

import java.util.Random;
import java.util.Scanner;

public class FruitVegetables {
    String name;
    int price;
    int qolich;

    public FruitVegetables (String name, int price, int qolich) {
        this.name = name;
        this.price = price;
        this.qolich = qolich;
    }

    public FruitVegetables() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQolich() {
        return qolich;
    }

    public void setQolich(int qolich) {
        this.qolich = qolich;
    }

}


