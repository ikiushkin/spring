package services;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Util {
    public EmployeeService employeeService;
    public PositionService positionService;
    public SalaryService salaryService;
}
