package harouane.u5w1weeklyproject.DAOs;

import harouane.u5w1weeklyproject.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationDAO extends JpaRepository<Reservation, Long> {
}
