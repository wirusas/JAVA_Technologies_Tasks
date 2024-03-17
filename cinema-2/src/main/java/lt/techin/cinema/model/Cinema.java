package lt.techin.cinema.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;

@Entity
@Data
@Table(name = "CINEMA")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int rows;
    private int columns;

    private ArrayList<Seat> seats = new ArrayList<>();

    public Cinema() {
        this.rows = 9;
        this.columns = 9;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                Seat seat = new Seat();
                seat.setRow(i);
                seat.setColumn(j);
                seat.setPrice(i <= 4 ? 10.0 : 8.0);
                seat.setOccupied(false);
                seats.add(seat);
            }
        }
    }
}
