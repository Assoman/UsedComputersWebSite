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
import java.util.ArrayList;
import java.util.List;

/**
 * This Servlet searches for products by name and within requested radius.
 * @author Osamah Shareef
 */

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

        // to use this product name when no result returns
        request.setAttribute("productName", pName);

        GenericDao approvedProducts = new GenericDao(Product.class);
        APIService apiService = new APIService();
        List<ZipCodesItem> zipCodesItems = new ArrayList<>();

        try {
            zipCodesItems = apiService.ApiServiceCalculation(zipcode, distance);
            request.setAttribute("returnedZipcodes", zipCodesItems.get(49).getZipCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Product> productList = approvedProducts.searchByProductNameAndApproved(pName);
        request.setAttribute("testProduct", productList.size());
        List<Product> searchedProduct = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            for (int z = 0; z < zipCodesItems.size(); z++) {
                if (productList.get(i).getUser().getZipcode() == zipCodesItems.get(z).getZipCode()) {
                    searchedProduct.add(productList.get(i));
                }
            }
        }

        request.setAttribute("products", searchedProduct);

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
