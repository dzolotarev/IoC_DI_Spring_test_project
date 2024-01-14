package ru.dzolotarev.beandefinitions;

import org.springframework.stereotype.Component;

/**
 * @author Denis Zolotarev
 */

@Component
public class FastCook {

    public void cook(String dish) {
        System.out.println("Я быстрый повар");
        System.out.println("Начал готовить: " + dish);
    }
}
