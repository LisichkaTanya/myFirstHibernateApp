package dao;

import models.*;
import java.util.*;

public interface UserDao {
    public User findById(int id);
    public void save(User user);
    public void update(User user);
    public void delete(User user);
    public Auto findAutoById(int id);
    public List<User> findAll();
}

