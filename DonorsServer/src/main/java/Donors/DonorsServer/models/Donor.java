package Donors.DonorsServer.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "DONORS")
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gender;
    private String name;
    private String surname;
    private Integer age;
    private String bloodGroup;

}
