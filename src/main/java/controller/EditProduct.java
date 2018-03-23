package controller;

import entity.Product;
import persistence.GenericDao;

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
        Product product = new Product();

        genericDao.saveOrUpdate(product);

       /* if (product == null) {
            response.sendRedirect("usersAdmin.jsp");
        }*/
    }

}
