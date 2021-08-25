package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import services.EmployeeService;
import services.PositionService;
import services.SalaryService;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
    private String name;
    private List<Position> positions;
    private List<Employee> employees;
    private EmployeeService employeeService;
    private PositionService positionService;
    private SalaryService salaryService;

    public Company(String name) {
        this.name = name;
    }


}
