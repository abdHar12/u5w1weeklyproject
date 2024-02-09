package harouane.u5w1weeklyproject.DAOs;

import com.github.javafaker.Faker;
import harouane.u5w1weeklyproject.Entities.User;
import harouane.u5w1weeklyproject.Entities.Workstation;
import harouane.u5w1weeklyproject.Exceptions.NotFindAnyElement;
import harouane.u5w1weeklyproject.U5w1weeklyprojectApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

   public void save(User user){
        userDAO.save(user);
    }

    public List<User> getAll() throws NotFindAnyElement {
        List<User> userList=userDAO.findAll();
        if (userList.isEmpty()) throw new NotFindAnyElement();
        return userList;
    }
    public User createRandomUser(){
        Faker faker=new Faker();

        return new User(faker.name().firstName()+" "+faker.name().lastName(), faker.internet().emailAddress());
    }

    public Optional<User> findById(Long id) throws NotFindAnyElement {
        Optional<User> found = userDAO.findById(id);
        if (found.isPresent()) return found;
        throw new NotFindAnyElement();
    }
}
