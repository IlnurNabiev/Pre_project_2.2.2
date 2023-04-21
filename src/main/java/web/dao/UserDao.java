package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface UserDao {
    

    List<User> getAll();
}
