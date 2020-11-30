package DataBase;

import model.User;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import java.util.Base64;

@Stateful // ������ ��������� ��������������
public class UserDB {
    private final EntityManager entityManager = Persistence.
            createEntityManagerFactory("default").
            createEntityManager();

    public User createUser(String login, String password) { //�������� ������������
        try {
            final User entity = new User();
            entity.setLogin(login);
            entity.setPassword(Base64.getEncoder().encodeToString((password).getBytes())); //����������� ������
            entityManager.persist(entity);
            entityManager.flush();

            return entity;

        } catch (PersistenceException e) {
            return null;
        }
    }

    public boolean saveUser(User user) { //���������� �������� � ������������
        try {
            entityManager.merge(user);
            entityManager.flush();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean checkPassword(User login, String password) { //�������� ������
        return login.getPassword().equals(new String(Base64.getDecoder().decode((password)))); //�������������
    }

    public User findUser(String login) { //����� ������������� ������
        return entityManager.createQuery(" from User where login = :login", User.class)
                .setParameter("login", login).getSingleResult();
    }
}
