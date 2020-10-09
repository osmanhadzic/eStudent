package dao;

import models.Admin;
import models.Asistent;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;
import java.util.Optional;

public class AsistantDaoImpl implements AsistantDao {

    @Override
    public Optional<Asistent> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Asistent> getAll() {
        return null;
    }

    @Override
    public void save(Asistent asistent) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(asistent);
            transaction.commit();
            session.close();

        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(Asistent asistent, String[] params) {

    }

    @Override
    public void delete(Asistent asistent) {

    }
}
