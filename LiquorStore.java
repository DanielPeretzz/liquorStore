package com.homework.daniel.Model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class LiquorStore<cashInRegister> {
    Drinks drinks = new Drinks();
static final Scanner SCANNER = new Scanner(System.in);
    public LiquorStore(String ownerName) {
        this.cashInRegister = cashInRegister = 0;
        this.ownerName = getOwnerName();
        this.availableDrinks = drinks.getName();
        this.priceMenu = drinks.getPrice();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String[] getAvailableDrinks() {
        return availableDrinks;
    }

    public int[] getPriceMenu() {
        return priceMenu;
    }

    @Override
    public String toString() {
        return "LiquorStore{" +
                "ownerName='" + ownerName + '\'' +
                ", availableDrinks=" + Arrays.toString(availableDrinks) +
                ", cashInRegister=" + Arrays.toString(priceMenu) +
                '}';
    }

    private final String ownerName;
    private final String[] availableDrinks;
    private final int[] priceMenu;
    private int cashInRegister;


    public void purchaseDrink(String drinkName, double amountOfMoney){
        int indexHelper = 0;
        for (int i = 0; i < availableDrinks.length; i++) {
            if (Objects.equals(availableDrinks[i], drinkName)) {
                indexHelper += i;
            }
        }
        System.out.println("Great choice, its :" + priceMenu[indexHelper] +"$");
        if (amountOfMoney > priceMenu[indexHelper]) {;
            System.out.println("You have enough money, enjoy you drink Sir"+"\nyour excess is :\n" +
                    ""+(amountOfMoney - priceMenu[indexHelper])+"$");
            this.cashInRegister += priceMenu[indexHelper];
        }
        else {
            System.out.println("Sorry you don't have enough money Sir");
        }
        availableDrinks[indexHelper] = drinkName + " Sold Out";

        System.out.println("total cash is : " + cashInRegister);
    }
    public void printAllAvailableDrinks() {
        System.out.println("Drink inventory Status : \n" + Arrays.toString(drinks.getName()));
    }


}

//priceMenu[indexHelper]