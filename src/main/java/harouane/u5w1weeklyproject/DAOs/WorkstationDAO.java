package harouane.u5w1weeklyproject.DAOs;


import harouane.u5w1weeklyproject.Entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkstationDAO extends JpaRepository<Workstation, Long>{
    Optional<Workstation> findById(Long id);
}
