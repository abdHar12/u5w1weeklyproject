package harouane.u5w1weeklyproject.DAOs;

import harouane.u5w1weeklyproject.Entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingDAO extends JpaRepository<Building, Long> {
    List<Building> findAll();
}
