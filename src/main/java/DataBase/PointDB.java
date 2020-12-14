package DataBase;

import model.Point;
import model.User;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import java.util.List;

@Stateful //������ ���������� �������
public class PointDB {
    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private final EntityManager em = factory.createEntityManager();

    public Point createPoint(Double x, Double y, Double r, User user) { //�������� �����

        try {
            final Point entity = new Point();
            entity.setOwner(user);
            entity.setR(r);
            entity.setX(x);
            entity.setY(y);
            entity.check(); //�������� �� ����
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();

            return entity;
        } catch (PersistenceException e) {
            return null;
        }
    }

    public boolean saveEntry(Point point) { //���������� �������� � �����
        try {
            em.getTransaction().begin();
            em.persist(point);
            em.getTransaction().commit();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public List<Point> findPoint(User owner) { //����� ����� � ������������
        return em.createQuery("from Point where owner = :owner ", Point.class)
                .setParameter("owner", owner).getResultList();
    }
}
