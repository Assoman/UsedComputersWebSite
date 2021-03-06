package controller;

import entity.Role;
import entity.User;
import org.apache.catalina.realm.RealmBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * This Servlet adds user.
 * @author Osamah Shareef
 */
@WebServlet(
        name = "addSeller",
        urlPatterns = {"/addSeller"}
)
public class AddSeller extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao seller = new GenericDao(User.class);
        HttpSession session = request.getSession();
        boolean continueProcess = true;
        boolean continueProcessZipcode = true;
        Logger logger = LogManager.getLogger(this.getClass());

        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String uName = request.getParameter("uName");
        //String pass = request.getParameter("pass");
        String pass = RealmBase.Digest(request.getParameter("pass"), "sha-256", "UTF-8");
        /*String pass = request.getParameter("pass");
        MessageDigestCredentialHandler credentialHandler = new MessageDigestCredentialHandler();
        try {
            credentialHandler.setAlgorithm("sha-256");
        } catch (NoSuchAlgorithmException nsa){
            logger.error("Password error: " + nsa);
        }
        credentialHandler.setEncoding("UTF-8");
        String hashedPassword = credentialHandler.mutate(pass);*/
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        LocalDate joinDate = LocalDate.now();
        int approved = 0;
        int zipcode = 0;
        final int arraySize = 7;

        if (request.getParameter("zipcode").equals("")) {
            session.setAttribute("AddedMessage", "Please, make sure all form fields are filled.");
            continueProcessZipcode = false;
            continueProcess = false;
        } else {
            zipcode = Integer.valueOf(request.getParameter("zipcode"));
        }

        if (continueProcessZipcode) {
            List<String> userEntries = new ArrayList<>();
            userEntries.add(fName);
            userEntries.add(lName);
            userEntries.add(uName);
            userEntries.add(pass);
            userEntries.add(email);
            userEntries.add(city);
            userEntries.add(state);

            for (int i = 0; i < arraySize; i++) {
                if (userEntries.get(i).equals("")) {
                    session.setAttribute("AddedMessage", "Please, make sure all form fields are filled.");
                    continueProcess = false;
                    break;
                }
            }
        }

        if (continueProcess) {
            User user = new User(uName, pass, fName, lName, email, city, state, zipcode, joinDate, approved);
            Role role = new Role(user, user.getUserName(), "seller");

            String infoMessage = "You've Entered: \n" + "Name: " + fName + "Last Name: " + lName + "\nUser Name: " + uName + "\nEmail: " + email
                    + "\nCity: " + city + "\nState: " + state + "\nZipcode: " + zipcode;

            user.addRole(role);
            seller.insert(user);

            session.setAttribute("AddedMessage", "Seller Added. Thank you!!!\n" + infoMessage);
        }

        response.sendRedirect("addSeller.jsp");
    }
}
