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
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sessions.UserManagerRemote;
import entities.BookLoan;
import entities.Customer;

/**
 *
 * @author mbadr
 * @version
 */
public class BooksToReturn extends HttpServlet {

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
        String id = request.getParameter("id");
        Customer cust = null;
        if (id!=null) {
            cust = userManagerBean.getCustomer(Integer.valueOf(id));
        }
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        if (cust==null) {
            out.println("<meta http-equiv=\"refresh\" content=\"0; url=UserLogin\">");
            out.println("</head>");
            out.println("<body>");
            
        } else {
            out.println("<title>User Main Page</title>");
            out.println("</head>");
            out.println("<body>");
            
            
           out.println("<Table border=1>");
           out.println("<TR><TD><B>ISBN</B></TD> <TD><B>Title</B></TD> <TD><B>Borrowing Date</B></TD></TR>");
           List<BookLoan> books = userManagerBean.getBooksOnLoan();
           for (BookLoan item:books) {
               if (item.getReturnDate()==null) {
                    Customer customer = userManagerBean.getCustomer(item.getPk().getCustomerId());
                     if (Integer.valueOf(id).equals(customer.getCustomerId())) {
                        if (userManagerBean.isBookAvailable(item.getBook().getIsbn())) {
                            out.println("<TR><TD>" + item.getBook().getIsbn() + "</TD>");
                            out.println("<TD><a href=\"ReturnBook?id=" + id + "\">" +item.getBook().getTitle() + "</a></TD>"); 
                            out.println("<TD>" + item.getBorrowingDate()+ "</TD></TR>");
                        }
                     }
               }
            }
            out.println("</Table>");
            
        }
        out.println("</body>");
        out.println("</html>");

        out.close();
    }

}
