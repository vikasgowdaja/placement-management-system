package examp1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//RegistrationServlet.java
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
     // Retrieve user input from the form
     String username = request.getParameter("username");
     String email = request.getParameter("email");

     // Create a UserBean instance and set the user's information
     UserBean user = new UserBean();
     user.setUsername(username);
     user.setEmail(email);

     // Store the UserBean in the request attribute
     request.setAttribute("user", user);

     // Forward the request to the JSP for presentation
     RequestDispatcher dispatcher = request.getRequestDispatcher("registrationResult.jsp");
     dispatcher.forward(request, response);
 }
}
