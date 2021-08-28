package core2.task_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class E {
    public void printClassName() {
        System.out.println("Method from E.class");
    }
}
