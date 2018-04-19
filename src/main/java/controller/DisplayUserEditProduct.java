package controller;

import entity.Product;
import persistence.GenericDao;

import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * This Servlet displays edit product JSP and gets the products info to edit.
 * @author Osamah Shareef
 */

@WebServlet(
        name = "displayUserEditProduct",
        urlPatterns = {"/displayUserEditProduct"}
)
public class DisplayUserEditProduct extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        HttpSession session = request.getSession();
        GenericDao product = new GenericDao(Product.class);

        String url = "/userEditProduct.jsp";

        session.removeAttribute("AddedMessage");

        int productID = Integer.valueOf(request.getParameter("productID"));
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("productID", productID);
        request.setAttribute("productID", productID);
        Product productToBeUpdated = (Product) product.getById(productID);
        request.setAttribute("brand", productToBeUpdated.getBrand());
        request.setAttribute("model", productToBeUpdated.getModelNumber());
        request.setAttribute("cpu", productToBeUpdated.getCpu());
        request.setAttribute("ram", productToBeUpdated.getRam());
        request.setAttribute("hdd", productToBeUpdated.getHdd());
        request.setAttribute("conditions", productToBeUpdated.getConditions());
        request.setAttribute("description", productToBeUpdated.getDescription());
        request.setAttribute("price", productToBeUpdated.getPrice());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}