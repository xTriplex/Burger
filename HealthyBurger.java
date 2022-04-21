package com.company;

public class HealthyBurger extends Burger{
    private String healthyItem1Name, healthyItem2Name;
    private double healthyItem1Price, healthyItem2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown", meat, price);
    }

    public void addHealthyBurgerItem1(String name, double price) {
        this.healthyItem1Name = name;
        this.healthyItem1Price = price;
    }

    public void addHealthyBurgerItem2(String name, double price) {
        this.healthyItem2Name = name;
        this.healthyItem2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();

        if(this.healthyItem1Name != null) {
            burgerPrice += this.healthyItem1Price;
            System.out.println("Added " + this.healthyItem1Name + " for: " + this.healthyItem1Price);
        }

        if(this.healthyItem2Name != null) {
            burgerPrice += this.healthyItem2Price;
            System.out.println("Added " + this.healthyItem2Name + " for: " + this.healthyItem2Price);
        }
        return burgerPrice;
    }
}
