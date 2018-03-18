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

@WebServlet(
        name = "addProduct",
        urlPatterns = {"/addProduct"}
)
public class AddProduct extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao product = new GenericDao(Product.class);
        HttpSession session = request.getSession();

        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String cpu = request.getParameter("cpu");
        String ram = request.getParameter("ram");
        String hdd = request.getParameter("hdd");
        String conditions = request.getParameter("conditions");
        String description = request.getParameter("description");
        double price = Integer.valueOf(request.getParameter("price"));
        int approved = 0;

        User user = new User();
        Product newProduct = new Product(brand, model, cpu, ram, hdd, conditions, description, price, approved, user);

        product.insert(newProduct);

        String infoMessage = "You've Entered: \n" + "Brand: " + brand + "\nModel: " + model + "\nCPU: " + cpu + "\nRAM: " + ram
                + "\nHard Disk: " + hdd + "\nCondition: " + conditions + "\nDescription: " + description + "\nPrice: " + price;

        if (!brand.isEmpty() && !model.isEmpty() && !cpu.isEmpty() && !ram.isEmpty() && !hdd.isEmpty() && !conditions.isEmpty() && !description.isEmpty()
                && price != 0) {
            session.setAttribute("AddedMessage", "Product Added. Thank you!!!\n" + infoMessage);
        } else {
            session.setAttribute("AddedMessage", "Please, make sure all form fields are filled.");
        }

        response.sendRedirect("addProduct.jsp");

    }
}
