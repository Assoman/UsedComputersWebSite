package controller;

import entity.Product;
import entity.Role;
import entity.User;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

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
        ServletContext servletContext = getServletContext();

        List<User> userIDList = user.getUserID(request.getRemoteUser());
        int userID = userIDList.get(0).getId();
        Set<Role> role = userIDList.get(0).getRoles();
        request.setAttribute("userID", userID);
        servletContext.setAttribute("userName", userIDList.get(0).getFirstName());
        servletContext.setAttribute("userRoles", role.iterator().next().getRoleName());
        request.setAttribute("products", products.getAllUsersOrProducts());

        RequestDispatcher dispatcher = request.getRequestDispatcher("sellerMainPage.jsp");
        dispatcher.forward(request, response);
    }
}