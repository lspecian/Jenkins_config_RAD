/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *|                                                                        |
 *| EJB 3.0 Online Library                                                 |
 *|                                                                        |
 *| Copyright IBM Corp. 2008.  All Rights Reserved.                  	   |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *|                                                                        |
 *| Use restricted, please refer to the "Restricted Materials" terms and   |
 *| conditions in the IBM International Program License Agreement.         |
 *+------------------------------------------------------------------------+
 */

package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sessions.UserManagerRemote;
import entities.Book;
import entities.Customer;

/**
 *
 * @author mbadr
 * @version
 */
public class BorrowBook extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
    private UserManagerRemote userManagerBean;
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String id = request.getParameter("userId");
        String bookISBN = request.getParameter("BookISBN");
        Customer cust = null;
        Book book = null;
        if (id!=null) {
            cust = userManagerBean.getCustomer(Integer.valueOf(id));
        }
        if (bookISBN!=null) {
            book = userManagerBean.getBook(bookISBN);
        }
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        if (cust==null || book==null) {
            out.println("<meta http-equiv=\"refresh\" content=\"0; url=UserLogin\">");
            out.println("</head>");
            out.println("<body>");
            
        } else {
            out.println("<title>User Main Page</title>");
            out.println("</head>");
            out.println("<body>");
            
            userManagerBean.borrowBook(Integer.valueOf(id),bookISBN);

            out.println("<P>You have borrow book " + book.getTitle() +  "for 5 days staring from today</P>");
        }
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
