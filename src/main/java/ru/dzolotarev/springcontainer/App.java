package ru.dzolotarev.springcontainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Denis Zolotarev
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        RestaurantService restaurantService = context.getBean(RestaurantService.class);
        restaurantService.cook("макароны");
    }

    @Configuration
    static class AppConfig {

        @Bean
        public FastCook fastCook() {
            return new FastCook();
        }

        @Bean
        public RestaurantService restaurantService() {
            return new RestaurantService(fastCook());
        }
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
