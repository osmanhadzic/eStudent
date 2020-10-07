package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet4Controller")
public class Servlet4Controller extends HttpServlet {
    public Servlet4Controller() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String param = request.getParameter("page");
            if (param.equals("login")){
                response.sendRedirect("/login.jsp");
            }else if (param.equals("logout")){
                HttpSession session = request.getSession(false);
                if(session!=null){

                    session.invalidate();
                    session=null;
                    System.out.println("delete" + session.getId());
                }
                response.sendRedirect("/login.jsp");
            }
            else {
                response.sendRedirect("/login.jsp");
            }
        }
    }

