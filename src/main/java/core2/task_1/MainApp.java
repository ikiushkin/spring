package core2.task_1;

import core2.task_1.model.F;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-core2.xml");

        System.out.println("********************************************************");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("********************************************************");

        F f = context.getBean(F.class);

        System.out.println("*************************************");
        System.out.println(f);
        System.out.println("*************************************");
    }
}
