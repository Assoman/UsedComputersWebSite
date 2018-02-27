package controller;

import entity.Product;
import entity.User;
import persistence.GenericDao;
import persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "searchProduct",
        urlPatterns = {"/searchProduct"}
)

public class SearchProduct extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pName = request.getParameter("pName");

        Product product = new Product();
        product.setBrand(pName);

        request.setAttribute("productName", product.getBrand());

        GenericDao genericDao = new GenericDao(Product.class);
        request.setAttribute("users", genericDao.searchByProductName(pName));
        //request.setAttribute("age", user.getAge());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/productResults.jsp");
        dispatcher.forward(request, response);
    }

}
