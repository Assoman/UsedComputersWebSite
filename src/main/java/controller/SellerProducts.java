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
import java.util.List;
/**
 * This Servlet displays products for logged in seller.
 * @author Osamah Shareef
 */

@WebServlet(
        name = "sellerProducts",
        urlPatterns = {"/sellerProducts"}
)

public class SellerProducts extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GenericDao products = new GenericDao(Product.class);
        GenericDao user = new GenericDao(User.class);

        List<User> userIDList = user.getUserID(request.getRemoteUser());
        int userID = userIDList.get(0).getId();

        request.setAttribute("userID", userID);
        request.setAttribute("products", products.getAllUsersOrProducts());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/sellerPage.jsp");
        dispatcher.forward(request, response);
    }
}