package core1.annotation_version;

import core1.annotation_version.model.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        System.out.println("********************************************************");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("********************************************************");

        Company company =  context.getBean(Company.class);
        System.out.println(company);
    }
}
