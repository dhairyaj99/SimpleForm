import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormHandler")
public class FormHandler extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String lastname = request.getParameter("lastname");
	    String address = request.getParameter("address");
	    String gender = request.getParameter("gender");

	    if (name == null || name.trim().isEmpty() || lastname == null || 
	    lastname.trim().isEmpty() || gender == null || gender.trim().isEmpty()) {
            request.setAttribute("errorMessage", "Name, Last Name, and Gender are mandatory fields");
            RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
            dispatcher.forward(request, response);
            return;
        }
	    request.setAttribute("name", name);
	    request.setAttribute("lastname", lastname);
	    request.setAttribute("address", address);
	    request.setAttribute("gender", gender);

	    RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
	    dispatcher.forward(request, response);
	}

}