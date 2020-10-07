import models.Student;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        User user = new Student();
        user.setfName("Osman");
        user.setlName("Hadzic");
        user.setDateBirth(new Date());
        user.setDeleted(false);
        user.setPlaceBirth("Tuzla");
        user.setNameDad("Mensur");
        user.setPassword("password1234");
        user.setLoginName("Osman123");
        
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = e.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
