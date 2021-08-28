package core1.xml_version.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Employee {

    @NotNull
    private String name;

    @NotNull
    @Size(min = 18)
    private int age;

    private Position position;
}
