package harouane.u5w1weeklyproject.DAOs;

import harouane.u5w1weeklyproject.Entities.User;
import harouane.u5w1weeklyproject.Entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    List<User> findAll();

    Optional<User> findById(long id);
}
