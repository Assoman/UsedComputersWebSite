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
import java.util.List;

@WebServlet(
        name = "displayAddProduct",
        urlPatterns = {"/displayAddProduct"}
)
public class DisplayAddProduct extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        HttpSession session = request.getSession();
        GenericDao user = new GenericDao(User.class);
        List<User> userIDList = user.getUserID(request.getRemoteUser());
        String url = "/addProduct.jsp";
        String errorUrl = "/error.jsp";
        session.removeAttribute("AddedMessage");

        if (userIDList.get(0).getApproved() == 1) {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        } else {
            //request.getSession().invalidate();
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(errorUrl);
            dispatcher.forward(request, response);
            //response.sendError(403);
        }

    }
}
