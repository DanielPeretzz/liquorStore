package com.homework.daniel.Model;

import java.util.Arrays;

public class Drinks {
    public Drinks() {
        this.name = new String[]{"Jack Daniel's", "Smirnoff", "Chivas", "Jameson", "Bacardi", "Absolut", "Grey Goose"};;
        this.price = new int[]{25, 30,33,10,20,21,50};;
    }

    public String[] getName() {
        return name;
    }

    public int[] getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Welcome to Liquor Store Below are our drinks : \n" +
                "name = " + Arrays.toString(name) +
                "\n price = " + Arrays.toString(price) +
                '}';
    }

    private final String[] name;
    private final int[] price;

}
