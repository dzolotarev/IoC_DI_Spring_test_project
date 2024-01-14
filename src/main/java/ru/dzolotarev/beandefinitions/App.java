package ru.dzolotarev.beandefinitions;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Denis Zolotarev
 */
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ru.dzolotarev.beandefinitions");

        applicationContext.getBean(RestaurantService.class).order("Pizza");
    }
}
