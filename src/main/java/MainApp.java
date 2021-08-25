import model.Company;
import model.Employee;
import model.Position;
import model.Salary;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Time;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Logger log = LogManager.getLogger();

        Employee e1 = context.getBean("it-emp1", Employee.class);
        Employee e2 = context.getBean("it-emp2", Employee.class);
        Employee e3 = context.getBean("it-emp3", Employee.class);

        Company itCompany = context.getBean("company", Company.class);

        List<Position> positions = itCompany.getPositions();
        List<Employee> employees = itCompany.getEmployees();

        try {
            int randomDayForDismiss = (int) (1 + (Math.random() * 36));
            int randomDayForTake = (int) (1 + (Math.random() * 36));

            for (int i = 0; i < 36; i++) {
                if (i % 3 == 0) {
                    for (Position p : positions) {
                        double curse = (1 + (Math.random() * 2));
                        int bonus = (int) (3000 + (Math.random() * 5000));
                        Salary oldSalary = p.getSalary();
                        Salary newSalary = new Salary(itCompany.getSalaryService().issueBonus(oldSalary, bonus, curse, 1));
                        p.setSalary(newSalary);
                        String s = String.format("Quarterly salary change. Salary for the the position %s has changed from %.2f to %.2f", p, oldSalary.getSalary(), newSalary.getSalary());
                        log.info(s);
                    }
                }

                if (i % 12 == 0) {
                    for (Position p : positions) {
                        Salary oldSalary = p.getSalary();
                        int inflation = (int) (1 + (Math.random() * 2));
                        int bonus = (int) (10000 + (Math.random() * 30000));
                        Salary newSalary = new Salary(itCompany.getSalaryService().issueBonus(p.getSalary(), bonus, 1, inflation));
                        p.setSalary(newSalary);
                        log.info(String.format("Annual salary change. Salary for the %s the position has changed from %.2f to %.2f", p, oldSalary.getSalary(), newSalary.getSalary()));
                    }
                }

                if (i == randomDayForDismiss) {
                    int random = (int) (Math.random() * employees.size());
                    Employee e = employees.get(random);
                    itCompany.getEmployeeService().dismissAnEmployee(e);
                    log.info(String.format("The %s was dismissed from the company %s", e, itCompany.getName()));
                }

                if (i == randomDayForTake) {
                    int random = (int) (Math.random() * positions.size());
                    Position p = positions.get(random);
                    itCompany.getEmployeeService().hireAnEmployee(e3, p);
                    log.info(String.format("An %s has been accepted for a position %s in the company %s", e3.getName(), p.getName(), itCompany.getName()));
                }

                Thread.sleep(100);
            }
        } catch (Exception e) {
            log.error(String.format("Message: %s, %s", e.getMessage(), e.getCause()));
        }
    }
}
