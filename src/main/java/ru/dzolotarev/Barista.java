package ru.dzolotarev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Barista {

    CoffeeInstructions coffeeInstructions;

    @Autowired
    public void setCoffeeInstructions(CoffeeInstructions coffeeInstructions) {
        this.coffeeInstructions = coffeeInstructions;
    }

    public void makeCoffee() {
        System.out.println("Получаем инструкции: " + coffeeInstructions.getInstructions());
        System.out.println("Сделали кофе: " + coffeeInstructions.getCoffeeName());
    }
}
