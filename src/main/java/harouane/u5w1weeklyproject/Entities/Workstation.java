package harouane.u5w1weeklyproject.Entities;


import harouane.u5w1weeklyproject.Enums.WorkstationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;

/*

    @OneToMany(mappedBy = "workstation")
    List<Reservation> reservations;
*/

    @ManyToOne
    @JoinColumn(name = "building_id")
    Building building;

    String description;

    @Enumerated(EnumType.STRING)
    WorkstationType workstationType;
    int maxReservations;

    public Workstation(String description, WorkstationType workstationType, int maxReservations, Building building) {
        this.building = building;
        this.description = description;
        this.workstationType = workstationType;
        this.maxReservations = maxReservations;
    }
}
