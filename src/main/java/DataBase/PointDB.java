package DataBase;

import model.Point;
import model.User;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import java.util.List;

@Stateful //������ ���������� �������
public class PointDB {
    private final EntityManager entityManager = Persistence.
            createEntityManagerFactory("default").
            createEntityManager();

    public Point createPoint(Double x, Double y, Double r, User user) { //�������� �����

        try {
            final Point entity = new Point();
            entity.setOwner(user);
            entity.setR(r);
            entity.setX(x);
            entity.setY(y);
            entity.check(); //�������� �� ����
            entityManager.persist(entity);
            entityManager.flush();

            return entity;
        } catch (PersistenceException e) {
            return null;
        }
    }

    public boolean saveEntry(Point point) { //���������� �������� � �����
        try {
            entityManager.merge(point);
            entityManager.flush();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public List<Point> findPoint(User owner) { //����� ����� � ������������
        return entityManager.createQuery("from ENTRY where owner = :owner ", Point.class)
                .setParameter("owner", owner).getResultList();
    }
}
