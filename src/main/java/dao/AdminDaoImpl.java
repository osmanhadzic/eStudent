package dao;

import models.Admin;
import models.Referent;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class AdminDaoImpl implements AdminDao {
    @Override
    public void addNewRefernt(Referent ref) {
        Dao<Referent> referentDao = new ReferentDaoImpl();
        referentDao.save(ref);
    }



    @Override
    public Optional<Admin> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Admin> getAll() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Admin ");
            List<Admin> adminList = query.list();
            transaction.commit();
            session.close();
            return adminList;
        }catch(Exception ex)
        {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public void save(Admin admin) {
        Transaction transaction1 = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction1 = session.beginTransaction();
            session.save(admin);
            transaction1.commit();
            session.close();
        }catch(Exception ex)
        {
            if (transaction1 != null) {
                transaction1.rollback();
            }
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void update(Admin admin, String[] params) {

    }


    @Override
    public void delete(Admin admin) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(admin);
            transaction.commit();
            session.close();
        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

    }
}
