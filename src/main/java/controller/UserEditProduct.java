package controller;

import entity.Product;
import entity.User;
import persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * This Servlet adds product.
 * @author Osamah Shareef
 */
@WebServlet(
        name = "userEditProduct",
        urlPatterns = {"/userEditProduct"}
)
public class UserEditProduct extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao product = new GenericDao(Product.class);
        GenericDao user = new GenericDao(User.class);
        HttpSession session = request.getSession();

        /*String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String cpu = request.getParameter("cpu");
        String ram = request.getParameter("ram");
        String hdd = request.getParameter("hdd");
        String conditions = request.getParameter("conditions");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        int approved = 0;*/

        int productID = Integer.valueOf(request.getParameter("productID"));
        User userProduct;
        List<User> userIDList = user.getUserID(request.getRemoteUser());
        int userID = userIDList.get(0).getId();
        userProduct = (User)user.getById(userID);

        Product productToBeEdited = (Product)product.getById(productID);

        /*String infoMessage = "You've Entered: \n" + "Brand: " + brand + "\nModel: " + model + "\nCPU: " + cpu + "\nRAM: " + ram
                + "\nHard Disk: " + hdd + "\nCondition: " + conditions + "\nDescription: " + description + "\nPrice: " + price
                + " User Name: " + request.getRemoteUser() + " User ID: " + userID;*/

        /*if (!brand.isEmpty() && !model.isEmpty() && !cpu.isEmpty() && !ram.isEmpty() && !hdd.isEmpty() && !conditions.isEmpty() && !description.isEmpty()
                && !price.isEmpty()) {*/
            product.saveOrUpdate(productToBeEdited);
            //session.setAttribute("AddedMessage", "Product Added. Thank you!!!\n" + infoMessage);
        /*} else {
            session.setAttribute("AddedMessage", "Please, make sure all form fields are filled.");
        }*/

        response.sendRedirect("addProduct.jsp");

    }
}
