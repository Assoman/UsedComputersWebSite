/*package controller;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(
        name = "displayAddSeller",
        urlPatterns = {"displayAddSeller"}
)
public class DisplayAddSeller extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        HttpSession session = request.getSession();
        String url = "/addSeller.jsp";
        session.removeAttribute("AddedMessage");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}*/
