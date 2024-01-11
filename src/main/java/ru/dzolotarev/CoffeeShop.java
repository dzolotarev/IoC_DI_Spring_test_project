package ru.dzolotarev;

public class CoffeeShop {
    public static void main(String[] args) {

        CoffeeInstructions coffeeInstructions = CoffeeFactory.getCOffeeInstructions("эспрессо"); // "латте"

        Barista barista = new Barista(coffeeInstructions);

        barista.makeCoffee();
    }
}
