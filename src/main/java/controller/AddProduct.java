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
import java.util.ArrayList;
import java.util.List;

/**
 * This Servlet adds product.
 * @author Osamah Shareef
 */
@WebServlet(
        name = "addProduct",
        urlPatterns = {"/addProduct"}
)
public class AddProduct extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao product = new GenericDao(Product.class);
        GenericDao user = new GenericDao(User.class);
        HttpSession session = request.getSession();

        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String cpu = request.getParameter("cpu");
        String ram = request.getParameter("ram");
        String hdd = request.getParameter("hdd");
        String conditions = request.getParameter("conditions");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        int approved = 0;

        ArrayList<String> userEntries = new ArrayList<>();
        userEntries.add(brand);
        userEntries.add(model);
        userEntries.add(cpu);
        userEntries.add(ram);
        userEntries.add(hdd);
        userEntries.add(conditions);
        userEntries.add(description);
        userEntries.add(price);

        User userProduct;
        List<User> userIDList = user.getUserID(request.getRemoteUser());
        int userID = userIDList.get(0).getId();
        userProduct = (User)user.getById(userID);
        Product newProduct = new Product(brand, model, cpu, ram, hdd, conditions, description, price, approved, userProduct);

        String infoMessage = "You've Entered: \n" + "Brand: " + brand + "\nModel: " + model + "\nCPU: " + cpu + "\nRAM: " + ram
                + "\nHard Disk: " + hdd + "\nCondition: " + conditions + "\nDescription: " + description + "\nPrice: " + price
                + " User Name: " + request.getRemoteUser() + " User ID: " + userID;

        /*if (!brand.isEmpty() && !model.isEmpty() && !cpu.isEmpty() && !ram.isEmpty() && !hdd.isEmpty() && !conditions.isEmpty() && !description.isEmpty()
                && !price.isEmpty()) if (Arrays.asList(userEntries).subList(0,7).contains(null))*/
        if (!userEntries.contains(null)) {
            product.insert(newProduct);
            session.setAttribute("AddedMessage", "Product Added. Thank you!!!\n" + infoMessage);
        } else {
            session.setAttribute("AddedMessage", "Please, make sure all form fields are filled.");
        }

        response.sendRedirect("addProduct.jsp");

    }
}
