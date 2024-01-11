package ru.dzolotarev;

public class Barista {

    CoffeeInstructions coffeeInstructions;

    public void makeCoffee() {
        System.out.println("Получаем инструкции: " + coffeeInstructions.getInstructions());
        System.out.println("Сделали кофе: " + coffeeInstructions.getCoffeeName());
    }

    public void setCoffeeInstructions(CoffeeInstructions coffeeInstructions) {
        this.coffeeInstructions = coffeeInstructions;
    }
}
