package com.company;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("Chicken", "white", "chicken", 10.0);
        burger.addBurgerItem1("Pickle", 0.42);
        burger.addBurgerItem2("Tomato", 0.15);
        burger.addBurgerItem3("Lettuce", 0.31);
        burger.addBurgerItem4("Olive", 0.44);
        System.out.println("\nTotal burger price is: " + burger.itemizeBurger() + "\n");

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.55);
        healthyBurger.addHealthyBurgerItem1("Lettuce", 0.31);
        healthyBurger.addHealthyBurgerItem2("Egg", 0.22);
        System.out.println("\nTotal healthy burger price is: " + healthyBurger.itemizeBurger() + "\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("\nTotal deluxe burger price is: " + deluxeBurger.itemizeBurger() + "\n");
        deluxeBurger.addBurgerItem1("Test", 73.57); // Test
    }
}
