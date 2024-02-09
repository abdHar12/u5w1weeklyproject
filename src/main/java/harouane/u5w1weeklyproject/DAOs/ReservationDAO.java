package harouane.u5w1weeklyproject.DAOs;

import harouane.u5w1weeklyproject.Entities.Reservation;
import harouane.u5w1weeklyproject.Entities.User;
import harouane.u5w1weeklyproject.Entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationDAO extends JpaRepository<Reservation, Long> {
    List<Reservation> findByDateAndWorkstation(LocalDate date, Workstation workstation);
    List<Reservation> findByDateAndUser(LocalDate date, User user);

}
