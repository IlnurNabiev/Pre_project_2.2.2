package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
@Transactional(readOnly = true)
public class UserServiceImpl {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> users = new ArrayList<>();
        users = userDao.getAll();
        for (User user: users) {
            System.out.println(user);
        }
    }
}
