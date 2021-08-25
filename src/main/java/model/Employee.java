package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Employee {
    private String name;
    private Position position;
    private Salary salary;
}
