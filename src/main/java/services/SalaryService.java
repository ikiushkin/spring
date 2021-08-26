package services;

import model.Salary;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {
    public double issueBonus(Salary salary, double bonus, double curse, double inflation) {
        return salary.getSalary() * curse * inflation + bonus;
    }
}
