package ru.dzolotarev;

/**
 * @author Denis Zolotarev
 */
public class LatteInstructionDependencyInjector implements CoffeeInstructionDependencyInjector {

    @Override
    public Barista getBarista() {
        LatteInstructions latteInstructions = new LatteInstructions();
        Barista barista = new Barista(latteInstructions);
        return barista;
    }
}
