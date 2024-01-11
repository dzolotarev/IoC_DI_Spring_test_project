package ru.dzolotarev;

/**
 * @author Denis Zolotarev
 */
public class LatteInstructionDependencyInjector implements CoffeeInstructionDependencyInjector {

    @Override
    public Barista getBarista() {
        LatteInstructions instructions = new LatteInstructions();
        Barista barista = new Barista(instructions);
        return barista;
    }
}
