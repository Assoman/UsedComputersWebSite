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

/**
 * This Servlet deletes product, for admin and seller use.
 * @author Osamah Shareef
 */

@WebServlet(
        name = "deleteProduct",
        urlPatterns = {"/deleteProduct"}
)

public class DeleteProduct extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO productID to be approved or deleted
        GenericDao genericDao = new GenericDao(Product.class);
        int productID = Integer.valueOf(request.getParameter("productID"));
        Product product = (Product)genericDao.getById(productID);

        genericDao.delete(product);

        request.setAttribute("product", "Product with ID " + product.getId() + " deleted.");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/deleted.jsp");
        dispatcher.forward(request, response);
    }

}