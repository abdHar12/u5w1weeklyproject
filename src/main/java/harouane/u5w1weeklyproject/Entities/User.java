package harouane.u5w1weeklyproject.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "username", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;
    String completeName;
    String email;

    @OneToMany(mappedBy = "user")
    List<Reservation> reservations;
    public User(String completeName, String email) {
        this.completeName = completeName;
        this.email = email;
    }
}
