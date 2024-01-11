package ru.dzolotarev;

/**
 * @author Denis Zolotarev
 */
public class EspressoInstructionDependencyInjector implements CoffeeInstructionDependencyInjector {

    @Override
    public Barista getBarista() {
        EspressoInstructions instructions = new EspressoInstructions();
        Barista barista = new Barista(instructions);
        return barista;
    }
}
