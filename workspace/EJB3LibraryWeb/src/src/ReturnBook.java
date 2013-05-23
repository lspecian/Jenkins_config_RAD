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
import entities.BookLoan;
import entities.BookLoanPK;

/**
 *
 * @author mbadr
 * @version
 */
public class ReturnBook extends HttpServlet {

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
        String loanID = request.getParameter("loanID");
        String UserID = request.getParameter("userID");
        String bookISBN = request.getParameter("bookISBN");
        BookLoan bookLoan = null;
        if (loanID!=null && UserID!=null && bookISBN!=null ) {
            BookLoanPK pk = new BookLoanPK();
            pk.setBookLoanId(Integer.valueOf(loanID));
            pk.setCustomerId(Integer.valueOf(UserID));
            pk.setIsbn(bookISBN);
            bookLoan = userManagerBean.getBookLoan(pk);
        }
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        if (bookLoan==null) {
            out.println("<meta http-equiv=\"refresh\" content=\"0; url=UserLogin\">");
            out.println("</head>");
            out.println("<body>");
            
        } else {
            out.println("<title>User Main Page</title>");
            out.println("</head>");
            out.println("<body>");
            
            userManagerBean.returnBook(bookLoan.getPk());

            out.println("<P>Thank you for returning book " + bookLoan.getBook().getTitle() +  "</P>");
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
}
