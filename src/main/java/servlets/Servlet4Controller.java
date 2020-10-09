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
        switch (param){
            case "login":{
                response.sendRedirect("login.jsp");
                break;
            }
            case "logout":{
                request.getSession().invalidate();
                response.sendRedirect("login.jsp");
                break;
            }
            default:{
                response.sendRedirect("index.jsp");
            }
        }

        }
    }

