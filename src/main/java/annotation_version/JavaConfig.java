package annotation_version;

import annotation_version.model.Company;
import annotation_version.model.Department;
import annotation_version.model.Employee;
import annotation_version.services.EmployeeService;
import annotation_version.services.PositionService;
import annotation_version.services.Util;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
    @Bean
    @Scope("prototype")
    public Company company() {
        return new Company();
    }

    @Bean
    @Scope("prototype")
    public Department department() {
        return new Department();
    }

    @Bean
    @Scope("prototype")
    public Employee employee() {
        return new Employee();
    }

    @Bean
    @Scope("prototype")
    public EmployeeService employeeService() {
        return new EmployeeService();
    }

    @Bean
    @Scope("prototype")
    public PositionService positionService() {
        return new PositionService();
    }

    @Bean
    @Scope("prototype")
    public Util util() {
        return new Util();
    }
}
