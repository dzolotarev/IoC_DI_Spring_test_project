package ru.dzolotarev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoffeeShop {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.dzolotarev");

        Barista barista = applicationContext.getBean(Barista.class);

        barista.makeCoffee();
    }
}
