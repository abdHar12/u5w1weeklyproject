package harouane.u5w1weeklyproject.Runners;

import harouane.u5w1weeklyproject.DAOs.UserService;
import harouane.u5w1weeklyproject.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    UserService userService;
    @Override
    public void run(String... args) throws Exception {
        User user= new User("MArio rossi", "qwertt");
        userService.save(user);
    }
}
