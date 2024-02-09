package harouane.u5w1weeklyproject.DAOs;

import harouane.u5w1weeklyproject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserDAO extends JpaRepository<User, UUID> {
    List<User> findAll();
}
