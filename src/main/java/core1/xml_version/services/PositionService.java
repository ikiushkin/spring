package core1.xml_version.services;

import lombok.*;
import core1.xml_version.model.Company;
import core1.xml_version.model.Position;

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
