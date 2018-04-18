package controller;

import entity.Role;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * This Servlet approves products, for admin use.
 * @author Osamah Shareef
 */

@WebServlet(
        name = "editRole",
        urlPatterns = {"/editRole"}
)

public class EditRole extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenericDao genericDao = new GenericDao(Role.class);

        int roleID = Integer.valueOf(request.getParameter("roleID"));
        Role role = (Role)genericDao.getById(roleID);

        if (role.getRoleName().equals("seller")) {
            role.setRoleName("admin");
        } else {
            role.setRoleName("seller");
        }

        genericDao.saveOrUpdate(role);

        request.setAttribute("role", "Role with ID " + role.getId() + " changed to admin.");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/approved.jsp");
        dispatcher.forward(request, response);
    }

}
