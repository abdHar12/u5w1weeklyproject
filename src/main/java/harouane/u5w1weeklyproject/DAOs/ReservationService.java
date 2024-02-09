package harouane.u5w1weeklyproject.DAOs;
import harouane.u5w1weeklyproject.DAOs.ReservationDAO;
import harouane.u5w1weeklyproject.Entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    ReservationDAO reservationDAO;

    public void save(Reservation reservation){
        reservationDAO.save(reservation);
    }
}
