package xml_version.services;

import xml_version.model.Employee;
import xml_version.model.Position;

public class EmployeeService {

    public void hireAnEmployee(Employee employee, Position position) {
        employee.setPosition(position);
    }

    public void dismissAnEmployee(Employee employee) {
        employee.setPosition(null);
    }
}
