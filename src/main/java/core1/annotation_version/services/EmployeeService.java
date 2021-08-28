package core1.annotation_version.services;

import org.springframework.stereotype.Component;
import core1.xml_version.model.Employee;
import core1.xml_version.model.Position;

@Component
public class EmployeeService {

    public void hireAnEmployee(Employee employee, Position position) {
        employee.setPosition(position);
    }

    public void dismissAnEmployee(Employee employee) {
        employee.setPosition(null);
    }
}
