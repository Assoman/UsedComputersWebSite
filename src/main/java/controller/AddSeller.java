package controller;

import entity.User;
import persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    }
}
