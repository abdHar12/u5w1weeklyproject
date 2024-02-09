package harouane.u5w1weeklyproject.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;
    String name;
    String address;
    String city;
/*

    @OneToMany(mappedBy = "building")
    List<Workstation> workstations;
*/

    public Building(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }


}
