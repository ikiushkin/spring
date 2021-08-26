package services;

import lombok.*;
import model.Company;
import model.Position;
import org.springframework.stereotype.Service;

@Service
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
