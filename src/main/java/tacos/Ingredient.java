package tacos;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class Ingredient {
    @Id
    private String id;
    private String name;
    private Type type;
    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
