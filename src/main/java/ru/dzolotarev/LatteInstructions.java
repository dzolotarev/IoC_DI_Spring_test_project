package ru.dzolotarev;

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
