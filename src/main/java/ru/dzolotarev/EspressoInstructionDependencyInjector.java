package ru.dzolotarev;

/**
 * @author Denis Zolotarev
 */
public class EspressoInstructionDependencyInjector implements CoffeeInstructionDependencyInjector {

    @Override
    public Barista getBarista() {
        EspressoInstructions espressoInstructions = new EspressoInstructions();
        Barista barista = new Barista(espressoInstructions);
        return barista;
    }
}
