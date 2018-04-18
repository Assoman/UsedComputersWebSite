package controller;

import entity.Product;
import entity.Role;
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
 * This Servlet controls the admin action.
 * @author Osamah Shareef
 */

@WebServlet(
        name = "adminApprove",
        urlPatterns = {"/adminApprove"}
)

public class AdminUserProductRole extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GenericDao users = new GenericDao(User.class);
        GenericDao products = new GenericDao(Product.class);
        GenericDao roles = new GenericDao(Role.class);
        request.setAttribute("users", users.getAllUsersOrProducts());
        request.setAttribute("products", products.getAllUsersOrProducts());
        request.setAttribute("roles", roles.getAllUsersOrProducts());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/adminPage.jsp");
        dispatcher.forward(request, response);
    }
}