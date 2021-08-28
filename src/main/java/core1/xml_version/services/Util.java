package core1.xml_version.services;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Util {

    public EmployeeService employeeService;

    private PositionService positionService;

    private SalaryService salaryService;

    public Util(EmployeeService employeeService, PositionService positionService, SalaryService salaryService) {
        this.employeeService = employeeService;
        this.positionService = positionService;
        this.salaryService = salaryService;
    }
}
