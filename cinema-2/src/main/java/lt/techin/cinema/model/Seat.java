package lt.techin.cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Seat {
    private int row;
    private int column;

    private double price;
    @JsonIgnore
    private boolean occupied;


}
