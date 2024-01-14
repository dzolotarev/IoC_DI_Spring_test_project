package ru.dzolotarev.beandefinitions;

import org.springframework.stereotype.Component;

/**
 * @author Denis Zolotarev
 */

@Component
public class RestaurantService {

    private final FastCook fastCook;

    public RestaurantService(FastCook fastCook) {
        this.fastCook = fastCook;
    }

    public void order(String dish) {
        fastCook.cook(dish);
    }
}
