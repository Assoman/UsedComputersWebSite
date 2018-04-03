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

/**
 * A simple servlet to welcome the user.
 * @author Osamah Shareef
 */

@WebServlet(
        name = "allApprovedProduct",
        urlPatterns = {"/allApprovedProduct"}
)

public class ShowAllApprovedProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GenericDao users = new GenericDao(User.class);
        GenericDao products = new GenericDao(Product.class);
        request.setAttribute("users", users.getAllUsersOrProducts());
        request.setAttribute("products", products.getApprovedProducts());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/displayApprovedProducts.jsp");
        dispatcher.forward(request, response);
    }
}