package ru.dzolotarev;

public class Barista {

    CoffeeInstructions coffeeInstructions;

    public Barista(CoffeeInstructions latteInstructions) {
        this.coffeeInstructions = latteInstructions;
    }

    public void makeCoffee() {
        System.out.println("Получаем инструкции: " + coffeeInstructions.getInstructions());
        System.out.println("Сделали кофе: " + coffeeInstructions.getCoffeeName());
    }


}
