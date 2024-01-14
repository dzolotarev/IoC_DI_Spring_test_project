package ru.dzolotarev.springcontainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Denis Zolotarev
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.dzolotarev.springcontainer");
        RestaurantService restaurantService = context.getBean(RestaurantService.class);
        restaurantService.cook("макароны");
    }


    @Component
    static class RestaurantService {

        private FastCook fastCook;

        public RestaurantService(FastCook fastCook) {
            this.fastCook = fastCook;
        }

        public void cook(String dish) {
            fastCook.cook(dish);
        }
    }

    @Component
    static class FastCook {

        public void cook(String dish) {
            System.out.println("Cooking " + dish);
        }
    }
}
