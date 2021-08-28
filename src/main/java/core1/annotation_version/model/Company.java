package core1.annotation_version.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("company")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Company {
    private String name;
    private List<Department> departments;
}
