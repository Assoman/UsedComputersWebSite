package controller;

import entity.Product;
import entity.User;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "editUser",
        urlPatterns = {"/editUser"}
)

public class EditUser extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO productID to be approved or deleted
        GenericDao genericDao = new GenericDao(User.class);
        int userID = Integer.valueOf(request.getParameter("userID"));
        User user = (User)genericDao.getById(userID);
        user.setApproved(1);
        genericDao.saveOrUpdate(user);

        request.setAttribute("user", "User with ID " + user.getId() + " approved.");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/approved.jsp");
        dispatcher.forward(request, response);

    }

}
