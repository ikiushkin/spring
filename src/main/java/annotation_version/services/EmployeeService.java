package annotation_version.services;

import org.springframework.stereotype.Component;
import xml_version.model.Employee;
import xml_version.model.Position;

@Component
public class EmployeeService {

    public void hireAnEmployee(Employee employee, Position position) {
        employee.setPosition(position);
    }

    public void dismissAnEmployee(Employee employee) {
        employee.setPosition(null);
    }
}
