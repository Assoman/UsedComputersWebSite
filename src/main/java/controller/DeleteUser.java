package controller;

import entity.Product;
import entity.User;
import persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "deleteUser",
        urlPatterns = {"/deleteUser"}
)

public class DeleteUser extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO productID to be approved or deleted
        GenericDao genericDao = new GenericDao(User.class);
        User user = new User();

        genericDao.delete(user);

       /* if (product == null) {
            response.sendRedirect("usersAdmin.jsp");
        }*/
    }

}