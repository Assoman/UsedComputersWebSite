package controller;

import entity.User;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * This Servlet approves users, for admin use.
 * @author Osamah Shareef
 */

@WebServlet(
        name = "editUser",
        urlPatterns = {"/editUser"}
)

public class AdminEditUser extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);
        int userID = Integer.valueOf(request.getParameter("userID"));
        User user = (User)genericDao.getById(userID);

        if (user.getApproved() == 0) {
            user.setApproved(1);
        } else {
            user.setApproved(0);
        }

        genericDao.saveOrUpdate(user);

        request.setAttribute("user", "User with ID " + user.getId() + " approved.");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/approved.jsp");
        dispatcher.forward(request, response);

    }

}
