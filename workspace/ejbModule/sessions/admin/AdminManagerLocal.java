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
package sessions.admin;

import java.util.List;
import entities.Author;
import entities.Book;
import entities.Customer;
import java.util.Date;
import javax.ejb.Local;

/** 
 * <!-- begin-UML-doc -->
 * This is the business interface for LibraryManager enterprise bean.
 * <!-- end-UML-doc -->
 * @author mbadr
 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
 */
@Local
public interface AdminManagerLocal {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getAuthors();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ISBN
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean isBookAvailable(String ISBN);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param AuthorID
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Author getAuthor(int AuthorID);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getBooks();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getCustomers();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public List getBooksOnLoan();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ISBN
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Book getBook(String ISBN);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param customerID
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public Customer getCustomer(int customerID);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param authorID
	 * @param authorFirstName
	 * @param authorLastName
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean createNewAuthor(int authorID, String authorFirstName,
			String authorLastName);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ISBN
	 * @param title
	 * @param publishingDate
	 * @param authorID
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean createNewBook(String ISBN, String title,
			Date publishingDate, int authorID);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param userID
	 * @param userFName
	 * @param userLName
	 * @param address
	 * @param email
	 * @param phone
	 * @return
	 * @generated "UML to EJB 3.0 (com.ibm.xtools.transform.uml2.ejb3.java.internal.UML2EJB3Transform)"
	 */
	public boolean createNewUser(int userID, String userFName,
			String userLName, String address, String email, String phone);
}