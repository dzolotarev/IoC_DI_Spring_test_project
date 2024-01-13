package ru.dzolotarev.springcontainer;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Denis Zolotarev
 */
public class App {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

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
