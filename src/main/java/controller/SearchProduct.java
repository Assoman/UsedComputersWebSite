package controller;

import entity.Product;
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
        int zipcode = Integer.valueOf(request.getParameter("zipcode"));
        double distance = Double.valueOf(request.getParameter("distance"));

        request.setAttribute("productName", pName);
        GenericDao genericDao = new GenericDao(Product.class);
        APIService apiService = new APIService();

        //request.setAttribute("products", genericDao.searchByProductNameAndApproved(pName));

        try {
            List<ZipCodesItem> zipCodesItems = apiService.ApiServiceCalculation(zipcode, distance);
            request.setAttribute("returnedZipcodes", zipCodesItems.get(49).getZipCode());
            request.setAttribute("products", genericDao.searchByProductNameAndApproved(pName, zipCodesItems));
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/productResults.jsp");
        dispatcher.forward(request, response);
    }

}
