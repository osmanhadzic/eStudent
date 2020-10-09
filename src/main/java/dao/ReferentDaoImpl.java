package dao;

import models.Referent;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;
import java.util.Optional;

public class ReferentDaoImpl implements ReferentDao {

    @Override
    public Optional<Referent> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Referent> getAll() {
        return null;
    }

    @Override
    public void save(Referent referent) {
        Transaction transRef = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transRef = session.beginTransaction();
            session.save(referent);
            transRef.commit();
            session.close();

        }catch (Exception e){
            if (transRef != null) {
                transRef.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(Referent referent, String[] params) {

    }

    @Override
    public void delete(Referent referent) {

    }
}
