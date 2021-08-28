package core2.task_1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;
@NoArgsConstructor
@Data
@ToString
public class F implements MethodReplacer, BeanPostProcessor {
    private String name;

    public F(String name) {
        this.name = name;
        System.out.println("*************************************");
        System.out.println("From F constructor");
    }

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) {
        System.out.println("Method from F.class");
        return null;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean " + beanName + " START");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean " + beanName + " END");
        return bean;
    }

    public void init() {
        System.out.println("Init method from F");
    }
}
