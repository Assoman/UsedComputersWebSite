package controller;

import entity.User;
import persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "searchLastName",
        urlPatterns = {"/searchLastName"}
)

public class SearchLastName extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String lName = request.getParameter("lName");
        User user = new User();
        user.setLastName(lName);

        request.setAttribute("lastName", user.getLastName());

        UserDao userDao = new UserDao();
        request.setAttribute("users", userDao.searchByLastName(lName));
        //request.setAttribute("age", user.getAge());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/results.jsp");
        dispatcher.forward(request, response);
    }

}
