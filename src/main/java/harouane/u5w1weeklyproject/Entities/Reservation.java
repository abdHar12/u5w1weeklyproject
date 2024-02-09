package harouane.u5w1weeklyproject.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;

    LocalDate date;

  @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    @ManyToOne
    @JoinColumn(name = "workstation_id")
    private Workstation workstation;

    public Reservation(LocalDate date, User user, Workstation workstation) {
        this.date = date;
        this.user = user;
        this.workstation = workstation;
    }

}
