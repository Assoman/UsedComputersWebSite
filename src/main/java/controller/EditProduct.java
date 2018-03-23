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
        name = "editProduct",
        urlPatterns = {"/editProduct"}
)

public class EditProduct extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao genericDao = new GenericDao(Product.class);
        Product product = (Product)genericDao.getById(3);

        product.setApproved(1);
        genericDao.saveOrUpdate(product);

        request.setAttribute("product", "Product with ID " + product.getId() + " gets approved.");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/approved.jsp");
        dispatcher.forward(request, response);
    }

}
