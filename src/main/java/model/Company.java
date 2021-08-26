package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.Util;

import javax.validation.constraints.*;
import java.util.List;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
    @NotNull(message = "the name must be specified")
    @Size(min = 1, max = 100)
    private String name;
    private List<Position> positions;
    private List<Employee> employees;

    @Autowired
    private Util util;

    public Company(String name) {
        this.name = name;
    }
}
