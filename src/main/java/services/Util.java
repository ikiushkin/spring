package services;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Data
public class Util {

    public EmployeeService employeeService;

    private PositionService positionService;

    private SalaryService salaryService;

    @Autowired
    public Util(EmployeeService employeeService, PositionService positionService, SalaryService salaryService) {
        this.employeeService = employeeService;
        this.positionService = positionService;
        this.salaryService = salaryService;
    }
}
