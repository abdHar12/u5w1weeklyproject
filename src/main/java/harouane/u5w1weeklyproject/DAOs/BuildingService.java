package harouane.u5w1weeklyproject.DAOs;


import com.github.javafaker.Faker;
import harouane.u5w1weeklyproject.Entities.Building;
import harouane.u5w1weeklyproject.Exceptions.NotFindAnyElement;
import harouane.u5w1weeklyproject.Suppliers.Suppliers;
import harouane.u5w1weeklyproject.U5w1weeklyprojectApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuildingService {
    @Autowired
    BuildingDAO buildingDAO;

    public void save(Building building){
        buildingDAO.save(building);
    }

    public List<Building> getAll() throws NotFindAnyElement {
        List<Building> buildingList=buildingDAO.findAll();
        if (buildingList.isEmpty()) throw new NotFindAnyElement();
        return buildingList;
    }

    public Building getRandomBuilding(){
        List<Building> allBuildings = this.getAll();
        return allBuildings.get(Suppliers.getRandomNumberFromMinToMax(0, allBuildings.size()-1));
    }

    public Building createRandomBuilding(){
        Faker faker=new Faker();

        return new Building(faker.name().title(), faker.address().streetAddress(), faker.address().cityName());
    };
}
