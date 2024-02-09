package harouane.u5w1weeklyproject.DAOs;

import harouane.u5w1weeklyproject.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

   public void save(User user){
        userDAO.save(user);
    }
/*
    public List<User> getAll() throws NotFindAnyElement {
        List<User> userList=userDAO.findAll();
        if (userList.isEmpty()) throw new NotFindAnyElement();
        return userList;
    }
    public User createRandomUser(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D5WeeklyProjectApplication.class);
        Faker faker=(Faker)ctx.getBean("faker");
        ctx.close();
        return new User(faker.name().firstName()+faker.name().lastName(), faker.internet().emailAddress());
    };*/
}
