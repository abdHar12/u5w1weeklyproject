package harouane.u5w1weeklyproject.Runners;

import com.github.javafaker.Faker;
import harouane.u5w1weeklyproject.DAOs.BuildingService;
import harouane.u5w1weeklyproject.DAOs.ReservationService;
import harouane.u5w1weeklyproject.DAOs.UserService;
import harouane.u5w1weeklyproject.DAOs.WorkstationService;
import harouane.u5w1weeklyproject.Entities.Building;
import harouane.u5w1weeklyproject.Entities.User;
import harouane.u5w1weeklyproject.U5w1weeklyprojectApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

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
        for (int i = 0; i < 10; i++) {
            userService.save(userService.createRandomUser());
            buildingService.save(buildingService.createRandomBuilding());
        }
        for (int i = 0; i < 5; i++) {
            workstationService.save(workstationService.createNewWorkstation());
        }
    }
}
