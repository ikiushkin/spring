import model.Company;
import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee e1 = context.getBean("it-emp1", Employee.class);
        System.out.println(e1);

        Company itCompany = context.getBean("company", Company.class);
        System.out.println(itCompany);

        System.out.println(itCompany.getPositions());
    }
}
