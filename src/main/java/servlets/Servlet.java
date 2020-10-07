package servlets;

import dao.RoleDao;
import dao.RoleDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import management.Role;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        UserDao userDao = new  UserDaoImpl();
        RoleDao roleDao = new RoleDaoImpl();
        User user = null;
        try {
            user = (User) userDao.Userlogin(name,pass);
            if(user != null){
                HttpSession session = request.getSession(true);
                session.setMaxInactiveInterval(300);
                session.setAttribute("user",user);
               /* String roleIs = roleDao.getRole(user.getUserID());
                if(roleIs.equals("S")){
                    response.sendRedirect("page/student.jsp");
                }else if(roleIs.equals("P")){
                    response.sendRedirect("page/profesor.jsp");
                }else if(roleIs.equals("AS")){
                    response.sendRedirect("page/asistan.jsp");
                }else if(roleIs.equals("R")){
                    response.sendRedirect("page/refernt.jsp");
                }else if(roleIs.equals("A")){
                    response.sendRedirect("page/admin.jsp");

                }else {
                    response.sendRedirect("home.jsp");
                }*/
                response.sendRedirect("home.jsp");
                System.out.println(session.getId());
            }else {
                response.sendRedirect("login.jsp");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
