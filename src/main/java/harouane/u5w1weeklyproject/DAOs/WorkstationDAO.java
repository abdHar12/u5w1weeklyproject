package harouane.u5w1weeklyproject.DAOs;


import harouane.u5w1weeklyproject.Entities.Workstation;
import harouane.u5w1weeklyproject.Enums.WorkstationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkstationDAO extends JpaRepository<Workstation, Long>{
    Optional<Workstation> findById(Long id);
    @Query("select w from Workstation w where w.building.city=:city and w.workstationType=:type")
    List<Workstation> findByWorkstationTypeAndCity(WorkstationType type, String city);
}
