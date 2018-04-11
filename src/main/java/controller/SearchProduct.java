package controller;

import entity.Product;
import entity.User;
import persistence.APIService;
import persistence.GenericDao;
import geocode.ZipCodesItem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "searchProduct",
        urlPatterns = {"/searchProduct"}
)

public class SearchProduct extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pName = request.getParameter("pName");
        //int zipcode = Integer.valueOf(request.getParameter("zipcode"));
        //double distance = Double.valueOf(request.getParameter("distance"));

        // to use this product name when no result returns
        request.setAttribute("productName", pName);

        GenericDao approvedProducts = new GenericDao(Product.class);
        //GenericDao genericDaoUsers = new GenericDao(User.class);
        //APIService apiService = new APIService();


        request.setAttribute("products", approvedProducts.searchByProductNameAndApproved(pName));
        request.setAttribute("testProduct", approvedProducts.searchByProductNameAndApproved(pName).get(0));

        /*try {
            List<ZipCodesItem> zipCodesItems = apiService.ApiServiceCalculation(zipcode, distance);
            request.setAttribute("returnedZipcodes", zipCodesItems.get(49).getZipCode());
            request.setAttribute("products", approvedProducts.searchByProductNameAndApproved(pName));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        RequestDispatcher dispatcher = request.getRequestDispatcher("/productResults.jsp");
        dispatcher.forward(request, response);
    }

}
