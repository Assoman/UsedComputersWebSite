package controller;

import entity.Product;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "deleteProduct",
        urlPatterns = {"/deleteProduct"}
)

public class DeleteProduct extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO productID to be approved or deleted
        GenericDao genericDao = new GenericDao(Product.class);
        Product product = new Product();

        genericDao.delete(product);

       /* if (product == null) {
            response.sendRedirect("usersAdmin.jsp");
        }*/
    }

}
