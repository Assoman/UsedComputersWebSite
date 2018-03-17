package controller;

import entity.User;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(
        name = "addSeller",
        urlPatterns = {"/addSeller"}
)
public class AddSeller extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao seller = new GenericDao(User.class);
        HttpSession session = request.getSession();

        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String uName = request.getParameter("uName");
        String pass = request.getParameter("pass");
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        int zipcode = Integer.valueOf(request.getParameter("zipcode"));
        LocalDate joinDate = LocalDate.now();
        int approved = 0;

        User user = new User(uName, pass, fName,lName, email, city, state, zipcode, joinDate, approved);

        seller.insert(user);

        String infoMessage = "You've Entered: \n" + "Name: " + fName + " " + lName + "\nUser Name: " + uName + "\nEmail: " + email
                + "\nCity: " + city + "\nState: " + state + "\nZipcode: " + zipcode;

        if (!fName.isEmpty() && !lName.isEmpty() && !uName.isEmpty() && !pass.isEmpty() && !email.isEmpty() && !city.isEmpty() && !state.isEmpty()
            && zipcode != 0) {
            session.setAttribute("AddedMessage", "Seller Added. Thank you!!!\n" + infoMessage);
        } else {
            session.setAttribute("AddedMessage", "Please, make sure all form fields are filled.");
        }

        response.sendRedirect("addSeller.jsp");
    }
}
