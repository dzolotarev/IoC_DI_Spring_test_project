package ru.dzolotarev;

/**
 * @author Denis Zolotarev
 */
public class CoffeeFactory {

    public static CoffeeInstructions getCoffeeInstructions(String coffeeName) {
        if (coffeeName == null) {
            return null;
        }

        CoffeeInstructions instructions = null;
        if (coffeeName.equalsIgnoreCase("Эспрессо")) {
            instructions = new EspressoInstructions();
        } else if (coffeeName.equalsIgnoreCase("Латте")) {
            instructions = new LatteInstructions();
        }
        return instructions;
    }
}
