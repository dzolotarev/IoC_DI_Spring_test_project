package ru.dzolotarev.springcontainer;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author Denis Zolotarev
 */
public class App {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerSingleton("myStr", new String("Hello there!"));
        String bean = (String) beanFactory.getBean("myStr");
        System.out.printf(bean);
    }
}
