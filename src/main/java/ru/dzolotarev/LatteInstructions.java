package ru.dzolotarev;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LatteInstructions implements CoffeeInstructions {

    @Override
    public String getInstructions() {
        return "берем молоко, кофе, сахар и варим";
    }

    @Override
    public String getCoffeeName() {
        return "латте";
    }
}
