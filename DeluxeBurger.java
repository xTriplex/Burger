package com.company;

public class DeluxeBurger extends Burger{

    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage", 24.32);
        super.addBurgerItem1("Chips", 5.32);
        super.addBurgerItem2("Drink", 2.53);
    }

    @Override
    public void addBurgerItem1(String name, double price) {
        System.out.println("Additional item(s) is not available for deluxe burger.");
    }

    @Override
    public void addBurgerItem2(String name, double price) {
        System.out.println("Additional items(s) is not available for deluxe burger.");
    }

    @Override
    public void addBurgerItem3(String name, double price) {
        System.out.println("Additional items(s) is not available for deluxe burger.");
    }

    @Override
    public void addBurgerItem4(String name, double price) {
        System.out.println("Additional item(s) is not available for deluxe burger.");
    }
}
