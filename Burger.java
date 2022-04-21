package com.company;

public class Burger {
    private String name, breadType, meat;
    private double price;

    private String item1Name, item2Name, item3Name, item4Name;
    private double item1Price, item2Price, item3Price, item4Price;

    public Burger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void addBurgerItem1(String name, double price) {
        this.item1Name = name;
        this.item1Price = price;
    }

    public void addBurgerItem2(String name, double price) {
        this.item2Name = name;
        this.item2Price = price;
    }

    public void addBurgerItem3(String name, double price) {
        this.item3Name = name;
        this.item3Price = price;
    }

    public void addBurgerItem4(String name, double price) {
        this.item4Name = name;
        this.item4Price = price;
    }

    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println(this.name + " burger on a " + this.breadType  + " bread " + "with " + this.meat + ". \nPrice is: " + this.price + "\n");

        if(this.item1Name != null) {
            burgerPrice += this.item1Price;
            System.out.println("Added " + this.item1Name + " for: " + this.item1Price);
        }

        if(this.item2Name != null) {
            burgerPrice += this.item2Price;
            System.out.println("Added " + this.item2Name + " for: " + this.item2Price);
        }

        if(this.item3Name != null) {
            burgerPrice += this.item3Price;
            System.out.println("Added " + this.item3Name + " for: " + this.item3Price);
        }

        if(this.item4Name != null) {
            burgerPrice += this.item4Price;
            System.out.println("Added " + this.item4Name + " for: " + this.item4Price);
        }
        return burgerPrice;
    }
}
