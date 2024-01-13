package ru.dzolotarev.iocndi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Barista {

    @Autowired
    private CoffeeInstructions coffeeInstructions;

    public void makeCoffee() {
        System.out.println("Получаем инструкции: " + coffeeInstructions.getInstructions());
        System.out.println("Сделали кофе: " + coffeeInstructions.getCoffeeName());
    }
}
