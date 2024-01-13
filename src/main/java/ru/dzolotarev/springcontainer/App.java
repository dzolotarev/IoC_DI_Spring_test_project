package ru.dzolotarev.springcontainer;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author Denis Zolotarev
 */
public class App {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerSingleton("fastCook", new FastCook());
        FastCook fastCook = beanFactory.getBean(FastCook.class);
        beanFactory.registerSingleton("restaurantService", new RestaurantService(fastCook));

        RestaurantService restaurantService = beanFactory.getBean(RestaurantService.class);
        restaurantService.cook("макароны");
    }

    static class RestaurantService {

        private FastCook fastCook;

        public RestaurantService(FastCook fastCook) {
            this.fastCook = fastCook;
        }

        public void cook(String dish) {
            fastCook.cook(dish);
        }
    }

    static class FastCook {

        public void cook(String dish) {
            System.out.println("Cooking " + dish);
        }
    }
}
