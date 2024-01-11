package ru.dzolotarev;

public class CoffeeShop {
    public static void main(String[] args) {

        CoffeeInstructions latteInstructions = new LatteInstructions();
        CoffeeInstructions espressoInstructions = new EspressoInstructions();
        Barista barista = new Barista(espressoInstructions);
        Barista barista1 = new Barista(latteInstructions);
        barista.makeCoffee();
        barista1.makeCoffee();
    }
}
