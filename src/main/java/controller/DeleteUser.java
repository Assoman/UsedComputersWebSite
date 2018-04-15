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
 * This Servlet deletes user, for admin use.
 * @author Osamah Shareef
 */

@WebServlet(
        name = "deleteUser",
        urlPatterns = {"/deleteUser"}
)

public class DeleteUser extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO productID to be approved or deleted
        GenericDao genericDao = new GenericDao(User.class);
        int userID = Integer.valueOf(request.getParameter("userID"));
        User user = (User)genericDao.getById(userID);

        genericDao.delete(user);

        request.setAttribute("user", "User with ID " + user.getId() + " deleted.");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/deleted.jsp");
        dispatcher.forward(request, response);
    }

}
