package services;

import dao.UserDao;
import dao.UserDaoImp1;
import models.Auto;
import models.User;
import java.util.List;

public class UserService {
    private UserDaoImp1 userDaoImp1 = new UserDaoImp1();

    public UserService() {}

    public User findUser(int id) {
        return userDaoImp1.findById(id);
    }

    public Auto findAutoById(int id) {
        return userDaoImp1.findAutoById(id);
    }

    public void saveUser(User user) {
        userDaoImp1.save(user);
    }

    public void deleteUser(User user) {
        userDaoImp1.delete(user);
    }

    public void updateUser(User user) {
        userDaoImp1.update(user);
    }

    public List<User> findAllUsers() {
        return userDaoImp1.findAll();
    }
}
