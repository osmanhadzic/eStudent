package dao;

import models.Student;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    @Override
    public Object Userlogin(String uname,String passsword) {
       /* Transaction transaction = null;
       User user = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            user = (User) session.createQuery("from User U where U.loginName = :uname").uniqueResult();

            if(user != null && user.getPassword().equals(passsword)){
                return user;
            }

        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }*/
        User user = new Student();
        user.setlName("Osmna");
        user.setfName("Hadzic");
        user.setLoginName("Osman1");
        user.setPassword("1234567");
       return user;
    }

    @Override
    public Optional<User> get(long id) {
        Transaction transaction = null;
    try(Session session = HibernateUtil.getSessionFactory().openSession()){

    }catch(Exception ex)
    {
        System.out.println(ex.getMessage());
    }
        return Optional.empty();
    }

    @Override
    public List<User> getAll() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){

        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public void save(User user) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            session.close();
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void update(User user, String[] params) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){

        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void delete(User user) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){

        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
