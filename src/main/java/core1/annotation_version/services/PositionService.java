package core1.annotation_version.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import core1.xml_version.model.Company;
import core1.xml_version.model.Position;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PositionService {
    private Company company;

    public void createOrUpdatePosition(Position position) {
        company.getPositions().add(position);
    }

    public void removePosition(Position position) {
        company.getPositions().remove(position);
    }

    public void showPosition(Position position) {
        company.getPositions().forEach(System.out::println);
    }
}
