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
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        name = "sellerProducts",
        urlPatterns = {"/sellerProducts"}
)

public class SellerProducts extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GenericDao products = new GenericDao(Product.class);

        request.setAttribute("products", products.getAllUsersOrProducts());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/sellerPage.jsp");
        dispatcher.forward(request, response);
    }
}