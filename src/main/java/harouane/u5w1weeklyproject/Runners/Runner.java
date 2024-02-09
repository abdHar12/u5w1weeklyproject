package harouane.u5w1weeklyproject.Runners;

import com.github.javafaker.Faker;
import harouane.u5w1weeklyproject.DAOs.BuildingService;
import harouane.u5w1weeklyproject.DAOs.ReservationService;
import harouane.u5w1weeklyproject.DAOs.UserService;
import harouane.u5w1weeklyproject.DAOs.WorkstationService;
import harouane.u5w1weeklyproject.Entities.Building;
import harouane.u5w1weeklyproject.Entities.Reservation;
import harouane.u5w1weeklyproject.Entities.User;
import harouane.u5w1weeklyproject.Entities.Workstation;
import harouane.u5w1weeklyproject.Exceptions.NotFindAnyElement;
import harouane.u5w1weeklyproject.U5w1weeklyprojectApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    UserService userService;
    @Autowired
    BuildingService buildingService;
    @Autowired
    WorkstationService workstationService;
    @Autowired
    ReservationService reservationService;

    @Override
    public void run(String... args) throws Exception {
        /*for (int i = 0; i < 10; i++) {
            userService.save(userService.createRandomUser());
            buildingService.save(buildingService.createRandomBuilding());
        }*/
        /*for (int i = 0; i < 5; i++) {
            workstationService.save(workstationService.createNewWorkstation());
        }*/
        Reservation reservation;
        try{
            Optional<User> user = userService.findById(1L);
            Optional<Workstation> workstation = workstationService.findById(4L);
            LocalDate date= LocalDate.parse("2024-02-09");
            if(user.isPresent() && workstation.isPresent()){
                if (reservationService.verifyTheAvailability(date, workstation.get(), user.get())) {
                    reservation = new Reservation(date, user.get(), workstation.get());
                    reservationService.save(reservation);
                }
            }
        }catch (NotFindAnyElement e){
            System.err.println(e.getMessage());
        }
    }
}
