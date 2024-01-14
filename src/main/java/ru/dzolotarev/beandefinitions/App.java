package ru.dzolotarev.beandefinitions;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Denis Zolotarev
 */

@Configuration
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ru.dzolotarev.beandefinitions");

        BeanDefinition beanDefinition =
                ((GenericApplicationContext) applicationContext).getBeanDefinition("restaurantService");
        System.out.println(beanDefinition);
        System.out.println(beanDefinition.getClass());
    }

    @Bean
    public  RestaurantService restaurantService() {
        return new RestaurantService(fastCook());
    }

    @Bean
    public FastCook fastCook() {
        return new FastCook();
    }
}
