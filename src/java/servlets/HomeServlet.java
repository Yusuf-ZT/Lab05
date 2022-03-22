
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 761450
 */
public class HomeServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");
        String logout = request.getParameter("logout");
        
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        //getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
        
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}
        
//            if (logout != null && logout.equals("Logout")){
//            session.invalidate();
//            System.out.println("hi");
//            }       
//        if(session.getAttribute("username") == null) {
//                session.invalidate();               
//            } else if (logout != null && logout.equals("Logout")){
//            session.invalidate();
//            System.out.println("hi");
//            }        
//        String logout = request.getParameter("logout");
//        if(logout != null && logout.equals("loggingout")) {
//            session.invalidate();
//        }