package ru.dzolotarev;

public class CoffeeShop {
    public static void main(String[] args) {

//        CoffeeInstructionDependencyInjector injector = new EspressoInstructionDependencyInjector();
        CoffeeInstructionDependencyInjector injector = new LatteInstructionDependencyInjector();

        Barista barista = injector.getBarista();

        barista.makeCoffee();
    }
}
