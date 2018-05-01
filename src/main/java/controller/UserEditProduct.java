package controller;

import entity.Product;
import persistence.GenericDao;

import javax.servlet.*;
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
        name = "userEditProduct",
        urlPatterns = {"/userEditProduct"}
)
public class UserEditProduct extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao product = new GenericDao(Product.class);
        HttpSession session = request.getSession();
        boolean continueProcess = true;

        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String cpu = request.getParameter("cpu");
        String ram = request.getParameter("ram");
        String hdd = request.getParameter("hdd");
        String conditions = request.getParameter("conditions");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        int approved = 0;
        final int arraySize = 8;

        List<String> userEntries = new ArrayList<>();
        userEntries.add(brand);
        userEntries.add(model);
        userEntries.add(cpu);
        userEntries.add(ram);
        userEntries.add(hdd);
        userEntries.add(conditions);
        userEntries.add(description);
        userEntries.add(price);

        for (int i = 0; i < arraySize; i++) {
            if (userEntries.get(i).equals("")) {
                session.setAttribute("AddedMessage", "Please, make sure all form fields are filled.");
                continueProcess = false;
                break;
            }
        }

        if (continueProcess) {
            ServletContext servletContext = getServletContext();
            int productID = (int) servletContext.getAttribute("productID");

            Product productToBeEdited = (Product) product.getById(productID);
            productToBeEdited.setBrand(brand);
            productToBeEdited.setModelNumber(model);
            productToBeEdited.setCpu(cpu);
            productToBeEdited.setRam(ram);
            productToBeEdited.setHdd(hdd);
            productToBeEdited.setConditions(conditions);
            productToBeEdited.setDescription(description);
            productToBeEdited.setPrice(price);
            productToBeEdited.setApproved(approved);

            String infoMessage = "You've Entered: \n" + "Brand: " + brand + "\nModel: " + model + "\nCPU: " + cpu + "\nRAM: " + ram
                    + "\nHard Disk: " + hdd + "\nCondition: " + conditions + "\nDescription: " + description + "\nPrice: " + price;


            product.saveOrUpdate(productToBeEdited);
            session.setAttribute("AddedMessage", "Product Added. Thank you!!!\n" + infoMessage);
        }

        response.sendRedirect("addProduct.jsp");

    }
}