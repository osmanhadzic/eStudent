package dao;

import management.Role;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class RoleDaoImpl implements RoleDao {
    @Override
    public String getRole(Long roleID) {
        Transaction transaction = null;
        Role role = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            role = (Role) session.createQuery("from Role U where U.student = :roleID");

            if(role.isStudent()==true){
                return "S";
            }else if(role.isProfesor()==true){
                return "P";
            }else if(role.isAsistant()==true){
                return "AS";
            }else if(role.isRefeerent()==true){
                return "R";
            }else {
                return "A";
            }

        }catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }
}
