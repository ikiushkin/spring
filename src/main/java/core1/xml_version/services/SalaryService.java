package core1.xml_version.services;

import core1.xml_version.model.Salary;

public class SalaryService {
    public double issueBonus(Salary salary, double bonus, double curse, double inflation) {
        return salary.getSalary() * curse * inflation + bonus;
    }
}
