package ru.dzolotarev.beandefinitions;

import org.springframework.beans.factory.support.GenericBeanDefinition;
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

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(App.MySuperClass.class);
        beanDefinition.setInitMethodName("myInitMethod");
        beanDefinition.setDestroyMethodName("myDestroyMethod");

        ((GenericApplicationContext) applicationContext).registerBeanDefinition("mySuperClass", beanDefinition);

        applicationContext.getBean(MySuperClass.class).myMethod();

        applicationContext.close(); //destroy method call
    }

    @Bean
    public RestaurantService restaurantService() {
        return new RestaurantService(fastCook());
    }

    @Bean
    public FastCook fastCook() {
        return new FastCook();
    }

    static class MySuperClass {
        public MySuperClass() {
            System.out.println("MySuperClass constructor");
        }

        public void myMethod() {
            System.out.println("MySuperClass myMethod");
        }

        public void myInitMethod() {
            System.out.println("MySuperClass myInitMethod");
        }

        public void myDestroyMethod() {
            System.out.println("MySuperClass myDestroyMethod");
        }
    }
}
