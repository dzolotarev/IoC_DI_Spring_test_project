package ru.dzolotarev;

import org.springframework.stereotype.Component;

@Component
public class EspressoInstructions implements CoffeeInstructions {

    @Override
    public String getInstructions() {
        return "берем х2 кофе и варим";
    }

    @Override
    public String getCoffeeName() {
        return "'эспрессо'";
    }
}
