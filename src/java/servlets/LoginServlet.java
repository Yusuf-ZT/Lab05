
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.AccountService;


public class LoginServlet extends HttpServlet {

  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

       getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uname = request.getParameter("username");
        String pword = request.getParameter("password");
        AccountService as = new AccountService();
        HttpSession session = request.getSession();
        
        if (as.login(uname, pword) != null){
            session.setAttribute("username", uname);  
            response.sendRedirect("home");
 
        } else {
            String message = "Invalid Login Details";
            session.setAttribute("invalidMessage", message);
            response.sendRedirect("login");
            }
        
    
                
        
    }



}
