package harouane.u5w1weeklyproject.DAOs;
import harouane.u5w1weeklyproject.DAOs.ReservationDAO;
import harouane.u5w1weeklyproject.Entities.Reservation;
import harouane.u5w1weeklyproject.Entities.User;
import harouane.u5w1weeklyproject.Entities.Workstation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationDAO reservationDAO;

    public void save(Reservation reservation){
        reservationDAO.save(reservation);
    }

    public boolean verifyTheAvailability(LocalDate date, Workstation workstation, User user){
        List<Reservation> foundByDateAndWorkstation=reservationDAO.findByDateAndWorkstation(date, workstation);
        List<Reservation> foundByDateAndUser= reservationDAO.findByDateAndUser(date, user);
        if(foundByDateAndWorkstation.isEmpty() || workstation.getMaxReservations()>foundByDateAndWorkstation.size()){
            if (foundByDateAndUser.isEmpty()) {
                System.out.println("Prenotazione aggiunta!");
                return true;
            }
            else{
                System.out.println("L'utente ha già una prenotazione!");
                return false;
            }
        }else{
            System.out.println("Non ci sono posti diponibili nella workstation");
            return false;
        }
    }
}
