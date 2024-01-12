package ru.dzolotarev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoffeeShop {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.dzolotarev");

        Barista barista = applicationContext.getBean(Barista.class);

        barista.makeCoffee();
    }
}
