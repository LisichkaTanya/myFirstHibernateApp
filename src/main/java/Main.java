import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User user = new User("Tatiana",38);
        userService.saveUser(user);
        Auto mazda = new Auto("Mazda", "black");
        mazda.setUser(user);
        user.addAuto(mazda);
        Auto kawasaki = new Auto("Kawasaki", "white");
        kawasaki.setUser(user);
        user.addAuto(kawasaki);
        userService.updateUser(user);
        user.setName("Dasha");
        user.setAge(9);
        userService.updateUser(user);
//        userService.updateUser(user);
//        userService.deleteUser(user);
    }
}
