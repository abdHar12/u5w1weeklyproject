package harouane.u5w1weeklyproject.DAOs;

import com.github.javafaker.Faker;

import harouane.u5w1weeklyproject.Entities.Workstation;
import harouane.u5w1weeklyproject.Enums.WorkstationType;
import harouane.u5w1weeklyproject.Suppliers.Suppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class WorkstationService {
    @Autowired
    WorkstationDAO workstationDAO;

    @Autowired
    BuildingService buildingService;
    public void save(Workstation workstation){
        workstationDAO.save(workstation);
    }
    public Workstation createNewWorkstation(){
        Faker faker=new Faker();
        WorkstationType workstationType = Suppliers.getWorkstationType.get();
        return new Workstation(faker.company().catchPhrase(), workstationType, workstationType.equals(WorkstationType.PRIVATO)? 1 : Suppliers.getRandomNumberFromMinToMax(2, 10), buildingService.getRandomBuilding());
    }
}
