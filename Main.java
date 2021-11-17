package com.homework.daniel;

import com.homework.daniel.Model.Drinks;
import com.homework.daniel.Model.LiquorStore;

public class Main {

    public static void main(String[] args) {
        Drinks drinks1 = new Drinks();
        System.out.println(drinks1);
        LiquorStore LiquorStore1 = new LiquorStore("Daniel");
        LiquorStore1.purchaseDrink("Smirnoff",50);
        LiquorStore1.printAllAvailableDrinks();
        LiquorStore1.purchaseDrink("Chivas",50);

    }
}
