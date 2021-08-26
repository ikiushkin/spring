package services;

import model.Employee;
import model.Position;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public void hireAnEmployee(Employee employee, Position position) {
        employee.setPosition(position);
    }

    public void dismissAnEmployee(Employee employee) {
        employee.setPosition(null);
    }
}
