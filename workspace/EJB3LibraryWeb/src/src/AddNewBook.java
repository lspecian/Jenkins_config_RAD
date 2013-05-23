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

import sessions.admin.AdminManagerLocal;
import entities.Author;

/**
 *
 * @author mbadr
 * @version
 */
public class AddNewBook extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
    private AdminManagerLocal libraryManagerBean;
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Create New Customer</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Create new Customer</h1>");
        out.println("<FORM METHOD=\"POST\" ACTION=\"AddNewBook_OP\">");
        out.println("<P><Table>");
        out.println("<TR><TD>Book LSBN:</TD><TD><INPUT TYPE=TEXT NAME=lsbn></TD></TR>");
        out.println("<TR><TD>Book Title:</TD><TD><INPUT TYPE=TEXT NAME=title></TD></TR>");
        out.println("<TR><TD>Publishing Date (mm/dd/yyyy):</TD><TD><INPUT TYPE=TEXT NAME=pubdate></TD></TR>");
        
        
        List<Author> authors = libraryManagerBean.getAuthors();
        out.println("<TR><TD>Author:</TD><TD>");
        out.println("<select name=\"author\" size=\"" + authors.size() + "\">");
        for (Author item:authors) {
            out.println("<option value=\"" + item.getAutherId() + "\">" + item.getAuthorFirstName() + " " + item.getAuthorLastName() + "</option>");
        }
        out.println("</select></TD>");
        out.println("<TR><TD></TD><TD><INPUT TYPE=SUBMIT NAME=SUBMIT VALUE=\"Submit Form\"></TD></TR>");
        out.println("</TR></Table>");
        out.println("</Form>");
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
